/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author fahri
 */
public class Tugas {
    String nama, tipe;
    int tahun, noSeri;
    
    public Tugas() {
        this.nama = "Porsche";
        this.tipe = "sport";
        this.tahun = 2026;
        this.noSeri = 26001; 
        
        System.out.println("Detail Mobil : " + nama + " | " + tipe + " | " + tahun + " | " + noSeri);
    }
    
    public Tugas(String nama, String tipe, int tahun, int noSeri) {
        this.nama = nama;
        this.tipe = tipe;
        this.tahun = tahun;
        this.noSeri = noSeri;
        
        System.out.println("Detail Mobil : " + nama + " | " + tipe + " | " + tahun + " | " + noSeri);
    }
}
