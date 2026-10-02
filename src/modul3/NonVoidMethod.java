/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
public class NonVoidMethod {
    String nama = "Luffy";
    String nim = "123456789";

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public double nilaiMax() {
        return 100;
    }

    public static void main(String[] args) {
        NonVoidMethod nv = new NonVoidMethod();
        System.out.println("Nama       : " + nv.getNama());
        System.out.println("NIM        : " + nv.getNIM());
        System.out.println("Nilai Max  : " + nv.nilaiMax());
    }
}
