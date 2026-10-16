/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author fahri
 */
public class Pegawai {
    double gajiPokok = 10000000;
}

class Programmer extends Pegawai {
    public static void main(String[] args) {
        double lemburPerjam = 50000;
        double gajiPerbulan;
        Pegawai pegawai = new Pegawai();
        gajiPerbulan = pegawai.gajiPokok + lemburPerjam;
        System.out.println(gajiPerbulan);
    }
}

class Teknisi extends Pegawai {
    public static void main(String[] args) {
        double lemburPerjam = 40000;
        double gajiPerbulan;
        Pegawai pegawai = new Pegawai();
        gajiPerbulan = pegawai.gajiPokok + lemburPerjam;
        System.out.println(gajiPerbulan);
    }
}
