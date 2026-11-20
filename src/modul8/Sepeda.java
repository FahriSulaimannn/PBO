/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author fahri
 */
public class Sepeda {
    void run() {
        System.out.println("Bisa Berjalan");
    }
}

class SepedaAir extends Sepeda {
    void run() {
        System.out.println("Hanya bisa berjalan diatas air");
    }
    public static void main(String[] args) {
        Sepeda s = new SepedaAir();
        s.run();
    }
}
