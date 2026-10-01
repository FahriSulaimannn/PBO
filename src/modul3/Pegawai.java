/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    public void isiData(String namaPegawai, int nipPegawai, double gajiPegawai) {
        nama = namaPegawai;
        nip = nipPegawai;
        gaji = gajiPegawai;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai : " + nama);
        System.out.println("NIP          : " + nip);
        System.out.println("Gaji         : Rp" + gaji);
        System.out.println("---------------------------------");
    }
}
