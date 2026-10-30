/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author fahri
 */
public class Manager extends Karyawan {
    private float jamKerja = 7.5f;
    
    public float getJamKerja() {
        return jamKerja;
    }

    public float getGajiManager() {
        return getGaji() * 2;
    }

    public void setJamKerja(float jamKerja) {
        this.jamKerja = jamKerja;
    }
}

class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();
        Manager m4 = new Manager();
        Manager m5 = new Manager();
        
        m1.setNama("Q");
        m2.setNama("W");
        m3.setNama("E");
        m4.setNama("R");
        m5.setNama("T");
        
        m1.setJamKerja(8.5f);

        System.out.println(m1.getJamKerja() + " " + m1.getNama());
        System.out.println(m2.getJamKerja() + " " + m2.getNama());
        System.out.println(m3.getJamKerja() + " " + m3.getNama());
        System.out.println(m4.getJamKerja() + " " + m4.getNama());
        System.out.println(m5.getJamKerja() + " " + m5.getNama());
        
    }
}
