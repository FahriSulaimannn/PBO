/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author fahri
 */
public class Bank {
    protected int rasioBunga() {
        return 0;
    }
}

class BankPribadi extends Bank {
    @Override
    protected int rasioBunga() {
        return 5;
    }
}

class BankUmum extends Bank {
    @Override
    protected int rasioBunga() {
        return 7;
    }
}

class BankPasar extends BankUmum {
    @Override
    protected int rasioBunga() {
        return 10;
    }
}

class BankSyariah extends BankUmum {
    @Override
    protected int rasioBunga() {
        return 4;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new BankPribadi();
        Bank b3 = new BankUmum();
        Bank b4 = new BankPasar();
        Bank b5 = new BankSyariah();

        System.out.println("Rasio Bunga Bank         : " + b1.rasioBunga() + "%");
        System.out.println("Rasio Bunga Bank Pribadi : " + b2.rasioBunga() + "%");
        System.out.println("Rasio Bunga Bank Umum    : " + b3.rasioBunga() + "%");
        System.out.println("Rasio Bunga Bank Pasar   : " + b4.rasioBunga() + "%");
        System.out.println("Rasio Bunga Bank Syariah : " + b5.rasioBunga() + "%");
    }
}
