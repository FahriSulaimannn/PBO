/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
public class Nilai {
    double nilaiUTS;
    double nilaiUAS;
    double nilaiTugas;
    double nilaiTotal; 
    
    public void setNilaiUTS(double uts) {
        nilaiUTS = uts;
    }
    
    public void setNilaiUAS(double uas) {
        nilaiUAS = uas;
    }
    
    public void setNilaiTugas(double tugas) {
        nilaiTugas = tugas;
    }
    
    public void hitungNilaiTotal() {
        nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }
    
    public double getNilaiUAS() {
        return nilaiUAS;
    }
    
    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public double getNilaiTotal() {
        return nilaiTotal;
    }
}
