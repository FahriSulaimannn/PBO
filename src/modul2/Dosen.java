package modul2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fahri
 */
public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    String tglLahir; 

    void tampilkanNama() {
        System.out.println("Nama Dosen: " + nama);
    }

    void tampilkanTglLahir() {
        System.out.println("Tanggal Lahir: " + tglLahir);
    }

    void tampilkanNik() {
        System.out.println("NIK: " + nik);
    }
}
