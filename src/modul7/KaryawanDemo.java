/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author fahri
 */
public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan();
        k1.setNama("Luffy");
        k1.setGaji(2500000);
        k1.setUsia(21);
        
        System.out.println(k1.getNama());
        System.out.println(k1.getGaji());
        System.out.println(k1.getUsia());
    }
}
