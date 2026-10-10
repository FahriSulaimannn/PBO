/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author fahri
 */
public class ParamConstructor {
    String nama, nim;
    int semester;
    
    public ParamConstructor (String nama, String nim, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
    }
    
    public void info() {
        System.out.println("Nama : " + nama + "\nNim : " + nim + "\nSemester : " + semester);
    }
}
