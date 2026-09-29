package modul2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fahri
 */
public class HewanDemo {
    public static void main(String[] args) {
        Hewan harimau = new Hewan();
        harimau.namaHewan = "Harimau";
        harimau.jumlahKaki = 4;
        harimau.makanan = "Daging";
        harimau.typeHewan = "Karnivora";

        harimau.tampilkanInfo();

        Hewan kerbau = new Hewan();
        kerbau.namaHewan = "Kerbau";
        kerbau.jumlahKaki = 4;
        kerbau.makanan = "Rumput";
        kerbau.typeHewan = "Karnivora"; 

        kerbau.tampilkanInfo();
    }
}
