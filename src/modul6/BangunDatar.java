/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author fahri
 */
public class BangunDatar {
    protected double luas;
    protected double keliling;

    protected double hitungLuas() { 
        return 0; 
    }
    protected double hitungKeliling() { 
        return 0; 
    }
}

class Persegi extends BangunDatar {
    protected double sisi = 4;

    @Override
    protected double hitungLuas() {
        return luas = sisi * sisi;
    }

    @Override
    protected double hitungKeliling() {
        return keliling = 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    protected int panjang = 5;
    protected double lebar = 3;

    @Override
    protected double hitungLuas() {
        return luas = panjang * lebar;
    }

    @Override
    protected double hitungKeliling() {
        return keliling = 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    protected double alas = 6;
    protected double tinggi = 4;

    @Override
    protected double hitungLuas() {
        return luas = 0.5 * alas * tinggi;
    }
}

class SegitigaSamaKaki extends Segitiga {
    protected double sisiMiring = 5;

    @Override
    protected double hitungKeliling() {
        return keliling = alas + (2 * sisiMiring);
    }
    
    @Override
    protected double hitungLuas() {
        return luas = 1/2 * alas * tinggi;
    }
}

class SegitigaSamaSisi extends Segitiga {
    protected double sisi = 6;

    @Override
    protected double hitungKeliling() {
        return keliling = 3 * sisi;
    }
}

class Main1 {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        System.out.println("Luas Persegi: " + p.hitungLuas());
        System.out.println("Keliling Persegi: " + p.hitungKeliling());

        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        
        SegitigaSamaKaki ssk = new SegitigaSamaKaki();
        System.out.println("Keliling Segitiga Sama Kaki : " + ssk.hitungKeliling());
        System.out.println("Luas Segitiga Sama Kaki : " + ssk.hitungLuas());

        SegitigaSamaSisi sss = new SegitigaSamaSisi();
        System.out.println("Luas Segitiga Sama Sisi (warisan Segitiga): " + sss.hitungLuas());
        System.out.println("Keliling Segitiga Sama Sisi: " + sss.hitungKeliling());
    }
}
