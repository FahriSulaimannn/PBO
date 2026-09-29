package modul2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fahri
 */
public class Roti {
    String warna;
    String rasa;
    int berat;
    double harga;

    void beriWarna(String warnaRoti) {
        warna = warnaRoti;
    }

    void beriRasa(String rasaRoti) {
        rasa = rasaRoti;
    }

    void timbangBerat(int beratRoti) {
        berat = beratRoti;
    }

    void hargaJual(double hargaRoti) {
        harga = hargaRoti;
    }

    void infoRoti() {
        System.out.println("Warna Roti: " + warna);
        System.out.println("Rasa Roti: " + rasa);
        System.out.println("Berat Roti: " + berat + " gram");
        System.out.println("Harga Roti: Rp" + harga);
    }
}
