/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author fahri
 */
import java.util.Date;

public class CustomerData {
    String nama;
    String alamat;
    Date tanggal_lahir;
    String pekerjaan;
    double gaji;

    public CustomerData() {
        this.nama = "Tidak Diketahui";
        this.alamat = "-";
        this.tanggal_lahir = null;
        this.pekerjaan = "Belum Bekerja";
        this.gaji = 0.0;
    }

    public CustomerData(String nama, String alamat, String pekerjaan, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggal_lahir = null;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    public CustomerData(String nama, String alamat, Date tanggal_lahir, String pekerjaan, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    void printOut() {
        System.out.println("Nama          : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Tanggal Lahir : " + tanggal_lahir);
        System.out.println("Pekerjaan     : " + pekerjaan);
        System.out.println("Gaji          : Rp " + gaji);
        System.out.println("----------------------------------------");
    }
}

class TestCustomer {
    public static void main(String[] args) {
        CustomerData c1 = new CustomerData("Budi", "Jl. Jalan", new Date(2005 - 1900, 2, 30), "Programmer", 1200000.00);
        CustomerData c2 = new CustomerData("Siti", "Jl. Merdeka No. 10", new Date(2000 - 1900, 7, 17), "Desainer", 4500000.00);
        CustomerData c3 = new CustomerData("Andi", "Jl. Sudirman", "Programmer", 120000.00);
        CustomerData c4 = new CustomerData("Dewi", "Jl. Melati No. 5", "Manager", 7000000.00);
        CustomerData c5 = new CustomerData("Rizky", "Jl. Ahmad Yani", "CEO", 12000000.00);
        CustomerData c6 = new CustomerData("Ayu", "Jl. Diponegoro", "Costomer Service", 21);
        CustomerData c7 = new CustomerData("Fajar", "Jl. Merapi", "Guru", 3500000.00);
        CustomerData c8 = new CustomerData("Nina", "Jl.Merbabu", "Dokter", 8000000.00);
        CustomerData c9 = new CustomerData();
        CustomerData c10 = new CustomerData("Hendra", "Jl. Gatot Subroto", new Date(1995 - 1900, 10, 5), "Manager", 9500000.00);

        c1.printOut();
        c2.printOut();
        c3.printOut();
        c4.printOut();
        c5.printOut();
        c6.printOut();
        c7.printOut();
        c8.printOut();
        c9.printOut();
        c10.printOut();
    }
}