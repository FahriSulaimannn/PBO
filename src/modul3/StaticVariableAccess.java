package modul3;

public class StaticVariableAccess {
    public static void main(String[] args) {
        StaticVeriable.akreditasi = 'B';
        StaticVeriable sv = new StaticVeriable();
        sv.firstMethod();
        sv.secondMethod();
    }
}
