/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
public class Rekening {
    double saldo;
    String no_rekening;
    String nama;

    public void cek_saldo() {
        System.out.println("Saldo rekening " + nama + " saat ini: Rp" + saldo);
    }

    public void menabung(double jumlah) {
        saldo = saldo + jumlah;
        System.out.println(nama + " berhasil menabung Rp" + jumlah);
    }
    
    public void menarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo = saldo - jumlah;
            System.out.println(nama + " berhasil menarik Rp" + jumlah);
        } else {
            System.out.println("Maaf, saldo " + nama + " tidak mencukupi untuk menarik Rp" + jumlah);
        }
    }

    public void transfer(Rekening tujuan, double jumlah) {
        if (saldo >= jumlah) {
            saldo = saldo - jumlah;
            tujuan.saldo = tujuan.saldo + jumlah;
            System.out.println(nama + " berhasil transfer Rp" + jumlah + " ke rekening " + tujuan.nama);
        } else {
            System.out.println("Maaf, saldo " + nama + " tidak mencukupi untuk transfer ke " + tujuan.nama);
        }
    }
}
