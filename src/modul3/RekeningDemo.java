/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
public class RekeningDemo {
    public static void main(String[] args) {
        Rekening rek1 = new Rekening();
        rek1.nama = "Andi";
        rek1.no_rekening = "1234567890";
        rek1.saldo = 500000;

        Rekening rek2 = new Rekening();
        rek2.nama = "Budi";
        rek2.no_rekening = "0987654321";
        rek2.saldo = 200000;

        System.out.println("=== CEK SALDO AWAL ===");
        rek1.cek_saldo();
        rek2.cek_saldo();
        System.out.println("---------------------------------");
        
        System.out.println("=== PROSES TRANSAKSI ANDI ===");
        rek1.menabung(300000);
        rek1.menarik(150000);        
        rek1.transfer(rek2, 250000); 
        System.out.println("---------------------------------");
        
        System.out.println("=== CEK SALDO AKHIR ===");
        rek1.cek_saldo();
        rek2.cek_saldo();
    }
}
