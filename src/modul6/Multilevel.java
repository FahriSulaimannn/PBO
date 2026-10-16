/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author fahri
 */
class A {
    public void MessageA(){
        System.out.println("Info dari kelas A");
    }
}

class B extends A {
    public void MessageB(){
        System.out.println("Info dari kelas B");
    }
}

class C extends B {
    public void MessageC(){
        System.out.println("Info dari kelas C");
    }
}

class D extends C {
    public void MessageD() {
        System.out.println("Info dari kelas D");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        a.MessageA();
        b.MessageB();
        b.MessageA();
        c.MessageA();
        c.MessageB();
        c.MessageC();
        
        d.MessageA();
        d.MessageB();
        d.MessageC();
        d.MessageD();
    }
}
