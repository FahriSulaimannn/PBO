/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
public class NilaiDemo {
    public static void main(String[] args) {
        Nilai orang1 = new Nilai();
        orang1.nilaiUTS = 70;
        orang1.nilaiUAS = 90;
        orang1.nilaiTugas = 80;
        orang1.hitungNilaiTotal();
        
        System.out.println("=== REKAP NILAI MAHASISWA ===");
        System.out.println("Nilai UTS   : " + orang1.getNilaiUTS());
        System.out.println("Nilai UAS   : " + orang1.getNilaiUAS());
        System.out.println("Nilai Tugas : " + orang1.getNilaiTugas());
        System.out.println("-----------------------------");
        
        System.out.println("Nilai Total : " + orang1.getNilaiTotal());
    }
}
