/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
class PegawaiDemo {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();

        pegawai1.isiData("Andi Saputra", 10111, 5500000);
        pegawai2.isiData("Budi Santoso", 10112, 6000000);
        pegawai3.isiData("Citra Lestari", 10113, 7500000);
        pegawai4.isiData("Dewi Maharani", 10114, 5000000);
        pegawai5.isiData("Eko Prasetyo", 10115, 8200000);

        System.out.println("=== DATA PEGAWAI ===");
        pegawai1.tampilkanInfo();
        pegawai2.tampilkanInfo();
        pegawai3.tampilkanInfo();
        pegawai4.tampilkanInfo();
        pegawai5.tampilkanInfo();
    }
}
