/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
public class InstanceVariable {
    int usia = 0;
    public void hitungUsia() {
        int tahunSekarang = 2026;
        int tahunLahir = 2007;
        usia = tahunSekarang - tahunLahir;
        System.out.println("Usia Saya : " + usia);
    }
    public void beratBadan() {
        int beratBadan = 0;
        int beratLahir = 70;
        beratBadan = beratLahir + (usia / 2);
        System.out.println("Berat : " + beratBadan);
    }
}
