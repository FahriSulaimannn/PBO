/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author fahri
 */
public class Hewan {
    public void jalan() {
        System.out.println("Hewan bisa berjalan");
    }
}

class Kucing extends Hewan {

    @Override
    public void jalan() {
        System.out.println("Kucing bisa berjalan dan berlari");
    }
    
}

class Elang extends Hewan {

    @Override
    public void jalan() {
        super.jalan();
        System.out.println("Elang juga bisa terbang");
    }
    
}

class main {
    public static void main(String[] args) {
        Hewan k1 = new Kucing();
        Hewan e1 = new Elang();
        
        k1.jalan();
        e1.jalan();
    }
}
