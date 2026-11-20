/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author fahri
 */
public class Pet {
    private String nama;
    
    public void beriNama(String nama) {
        this.nama = nama;
    }
    
    public String panggilNama() {
        return this.nama;
    }
    
    public String perilaku() {
        return "Hewan Penurut";
    }
    
    public void suara() {
        System.out.println("Suara hewan");
    }
}

class Kucing extends Pet {
    @Override
    public String perilaku() {
        return "Menyukai Ikan";
    }    
    
    @Override
    public void suara() {
        System.out.println("Meeooww... Meeooww");
    }
}

class Anjing extends Pet {
    @Override
    public String perilaku() {
        return "Menyukai Daging dan Tulang";
    }
    
    @Override
    public void suara() {
        System.out.println("Guk..Guk..Guk..");
    }
}

class main {
    public static void main(String[] args) {
        Pet k1 = new Kucing();
        Pet a1 = new Anjing();
        
        k1.beriNama("TOM");
        a1.beriNama("BULL");
        
        System.out.println(k1.panggilNama());
        System.out.println(k1.perilaku());
        k1.suara();
        
        System.out.println(a1.panggilNama());
        System.out.println(a1.perilaku());
        a1.suara();
    }
}
