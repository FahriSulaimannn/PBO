/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author fahri
 */
abstract class AbstrakClass {
    int a;
    int b;
    int c;

    public AbstrakClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int kali() {
        return a*b*c;
    }
}

class TurunanAbstrakClass extends AbstrakClass{
    int x;

    public TurunanAbstrakClass(int a, int b, int c) {
        super(a, b, c);
        x = a+b+c;
    }
    public void printX() {
        System.out.println(x);
    }
}

class ObjekAbstrakClass {
    public static void main(String[] args) {
//        AbstrakClass ac = new AbstrakClass(2, 3, 4);
        TurunanAbstrakClass tac = new TurunanAbstrakClass(2, 3, 2);
        tac.printX();
        System.out.println(tac.kali());
    }
}
