/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author fahri
 */
class Parentclaz{
    void printOut() {
        System.out.println("Ini adalah SuperClass");
    }
}

class Childclaz extends Parentclaz {
    void printOut() {
        System.out.println("Ini adalah SubClass");
    }
    void hello() {
        System.out.println("Hello World");
    }
}

public class DemoOverriding {
    public static void main(String[] args) {
        Parentclaz pc = new Parentclaz();
        Childclaz cc = new Childclaz();
        pc.printOut();
        cc.printOut();
    }
}
