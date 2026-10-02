/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

/**
 *
 * @author fahri
 */
public class MethodParameter {
    String nama;

    public String setNama(String nama) {
        return this.nama = nama;
    }

    public static void main(String[] args) {
        MethodParameter mp = new MethodParameter();
        mp.setNama("Luffy");
        System.out.println(mp.nama);
    }
}
