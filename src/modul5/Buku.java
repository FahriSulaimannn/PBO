/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author fahri
 */
public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanke;
    double hargaJual;
    
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanke, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanke = cetakanke;
        this.hargaJual = hargaJual;
    }

    public Buku(String judulBuku, String namaPengarang) {
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = 0;
        this.cetakanke = 0;
        this.hargaJual = 0.0;
    }

    public Buku() {
        this.judulBuku = "Belum Ada Judul";
        this.namaPengarang = "Anonim";
        this.tahunTerbit = 0;
        this.cetakanke = 0;
        this.hargaJual = 0.0;
    }

    public void tampilkanInfo() {
        System.out.println("Judul        : " + judulBuku);
        System.out.println("Pengarang    : " + namaPengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Cetakan ke-  : " + cetakanke);
        System.out.println("Harga Jual   : Rp" + hargaJual);
        System.out.println("------------------------------");
    }
}
