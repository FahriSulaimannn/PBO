/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author fahri
 */
public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Andrea Hirata", "Laskar Pelangi", 2005, 1, 75000);
        Buku buku2 = new Buku("Pramoedya A. Toer", "Bumi Manusia", 1980, 5, 95000);
        Buku buku3 = new Buku("Raditya Dika", "Kambing Jantan", 2005, 3, 55000);
        Buku buku4 = new Buku("Tere Liye", "Bumi", 2014, 2, 85000);
        Buku buku5 = new Buku("Fiersa Besari", "Garis Waktu", 2016, 4, 65000);
        Buku buku6 = new Buku("Ahmad Fuadi", "Negeri 5 Menara", 2009, 1, 80000);
        Buku buku7 = new Buku("Dee Lestari", "Supernova", 2001, 6, 90000);
        
        Buku buku8 = new Buku("Harry Potter", "J.K. Rowling");
        Buku buku9 = new Buku("Atomic Habits", "James Clear");
        
        Buku buku10 = new Buku();

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
        buku4.tampilkanInfo();
        buku5.tampilkanInfo();
        buku6.tampilkanInfo();
        buku7.tampilkanInfo();
        buku8.tampilkanInfo();
        buku9.tampilkanInfo();
        buku10.tampilkanInfo();
    }
}
