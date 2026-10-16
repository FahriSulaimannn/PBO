/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author fahri
 */
public class Kendaraan {
    protected Boolean roda = true;
    protected String nama = "Honda";
    protected int tahunTerbit = 2067;
}

class Mobil extends Kendaraan {
    protected String bahanBakar = "Bensin";
    protected String nama = "Subaru";
}

class Pesawat extends Kendaraan {
    protected String bahanBakar = "Avtur";
    protected int tahunTerbit = 2024;
}

class Main {
    public static void main(String[] args) {
//        Kendaraan k1 = new Kendaraan();
        Mobil k2 = new Mobil();
        Pesawat k3 = new Pesawat();
        
//        System.out.println(k1.roda + " " + k1.nama + " " + k1.tahunTerbit);
        System.out.println(k2.roda + " " + k2.nama + " " + k2.tahunTerbit + " " + k2.bahanBakar);
        System.out.println(k3.roda + " " + k3.nama + " " + k3.tahunTerbit + " " + k3.bahanBakar);
    }
}
