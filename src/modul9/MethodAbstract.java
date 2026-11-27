/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author fahri
 */

public abstract class MethodAbstract {
    public abstract double luas();
    public abstract double keliling();
    
    public double getLuas() {
        return luas();
    }
    
    public double getKeliling() {
        return keliling();
    }
}

class Persegi extends MethodAbstract {
    int sisi = 5;
    
    @Override
    public double luas() {
        return sisi * sisi;
    }
    
    @Override
    public double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends MethodAbstract {
    int panjang = 10;
    int lebar = 5;
    
    @Override
    public double luas() {
        return panjang * lebar;
    }
    
    @Override
    public double keliling() {
        return 2 * (panjang + lebar); 
    }
}

class JajarGenjang extends MethodAbstract {
    int alas = 7;
    int tinggi = 10;
    int sisiMiring = 8; 
    
    @Override
    public double luas() {
        return alas * tinggi;
    }
    
    @Override
    public double keliling() {
        return 2 * (alas + sisiMiring); 
    }
}

class Lingkaran extends MethodAbstract {
    double phi = 3.14;
    int jari = 12;
    
    @Override
    public double luas() {
        return phi * jari * jari;
    }
    
    @Override
    public double keliling() {
        return 2 * phi * jari;
    }
}

class Segitiga extends MethodAbstract {
    int alas = 7;
    int tinggi = 10;
    
    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }
    
    @Override
    public double keliling() {
        return 3 * alas; 
    }
}

class MethodMain {
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        System.out.println("=== Persegi ===");
        System.out.println("Keliling = " + psg.getKeliling());
        System.out.println("Luas     = " + psg.getLuas());

        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("\n=== Persegi Panjang ===");
        System.out.println("Keliling = " + pp.getKeliling());
        System.out.println("Luas     = " + pp.getLuas());

        JajarGenjang jg = new JajarGenjang();
        System.out.println("\n=== Jajar Genjang ===");
        System.out.println("Keliling = " + jg.getKeliling());
        System.out.println("Luas     = " + jg.getLuas());

        Lingkaran lkr = new Lingkaran();
        System.out.println("\n=== Lingkaran ===");
        System.out.println("Keliling = " + lkr.getKeliling());
        System.out.println("Luas     = " + lkr.getLuas());

        Segitiga sgt = new Segitiga();
        System.out.println("\n=== Segitiga ===");
        System.out.println("Keliling = " + sgt.getKeliling());
        System.out.println("Luas     = " + sgt.getLuas());
    }
}
