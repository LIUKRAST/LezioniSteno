package src.l1.e1;

public class E1Tester {
    public static void main(String[] args) {
        test(20, 5, true);
        test(6, 16, false);
        test(15, 7, true);
        test(30, 9, false);
        test(29, 8, false);
        test(1, 1, true);
        test(60, 3, false);
        test(10, 11, true);
        test(25, 4, false);
        test(0, 15, true);
    }

    public static void test(int a, int b, boolean r) {
        boolean t = E1.checkPrestazioni(a, b);
        if(r == t) System.out.println("Ottimo! Esercizio 1 passato!");
        else System.out.println("Peccato, i dati inseriti {" + a + "; " + b + "} hanno dato " + t + " ma la soluzione è " + r);
    }
}
