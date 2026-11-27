/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author fahri
 */
public abstract class BangunRuang {
    public abstract double volume();
    public abstract double luasPermukaan();

    public double getVolume() {
        return volume();
    }

    public double getLuasPermukaan() {
        return luasPermukaan();
    }
}

class Balok extends BangunRuang {
    double panjang = 10;
    double lebar = 5;
    double tinggi = 4;

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}

class Kubus extends BangunRuang {
    double sisi = 6;

    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double luasPermukaan() {
        return 6 * (sisi * sisi);
    }
}

class Bola extends BangunRuang {
    double phi = 3.14;
    double jari = 7;

    @Override
    public double volume() {
        return (4.0 / 3.0) * phi * jari * jari * jari;
    }

    @Override
    public double luasPermukaan() {
        return 4 * phi * jari * jari;
    }
}

class Kerucut extends BangunRuang {
    double phi = 3.14;
    double jari = 7;
    double tinggi = 12;

    @Override
    public double volume() {
        return (1.0 / 3.0) * phi * jari * jari * tinggi;
    }

    @Override
    public double luasPermukaan() {
        double garisPelukis = Math.sqrt((jari * jari) + (tinggi * tinggi));
        return phi * jari * (jari + garisPelukis);
    }
}

class PrismaSegitiga extends BangunRuang {
    double alasSegitiga = 6;
    double tinggiSegitiga = 8;
    double sisiMiringSegitiga = 10;
    double tinggiPrisma = 15;

    @Override
    public double volume() {
        double luasAlas = 0.5 * alasSegitiga * tinggiSegitiga;
        return luasAlas * tinggiPrisma;
    }

    @Override
    public double luasPermukaan() {
        double luasAlas = 0.5 * alasSegitiga * tinggiSegitiga;
        double kelilingAlas = alasSegitiga + tinggiSegitiga + sisiMiringSegitiga;
        return (2 * luasAlas) + (kelilingAlas * tinggiPrisma);
    }
}

class BangunRuangMain {
    public static void main(String[] args) {
        Balok blk = new Balok();
        System.out.println("=== Balok ===");
        System.out.println("Volume         = " + blk.getVolume());
        System.out.println("Luas Permukaan = " + blk.getLuasPermukaan());

        Kubus kbs = new Kubus();
        System.out.println("\n=== Kubus ===");
        System.out.println("Volume         = " + kbs.getVolume());
        System.out.println("Luas Permukaan = " + kbs.getLuasPermukaan());

        Bola bl = new Bola();
        System.out.println("\n=== Bola ===");
        System.out.println("Volume         = " + bl.getVolume());
        System.out.println("Luas Permukaan = " + bl.getLuasPermukaan());

        Kerucut krc = new Kerucut();
        System.out.println("\n=== Kerucut ===");
        System.out.println("Volume         = " + krc.getVolume());
        System.out.println("Luas Permukaan = " + krc.getLuasPermukaan());

        PrismaSegitiga ps = new PrismaSegitiga();
        System.out.println("\n=== Prisma Segitiga ===");
        System.out.println("Volume         = " + ps.getVolume());
        System.out.println("Luas Permukaan = " + ps.getLuasPermukaan());
    }
}
