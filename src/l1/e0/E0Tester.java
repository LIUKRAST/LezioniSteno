package l1.e0;

public class E0Tester {
    public static void main(String[] args) {
        for(int i = 0; i < 30; i++) test(i, (i&1)==0);
    }

    public static void test(int n, boolean r) {
        String pari = (n&1)==0 ? "pari" : "dispari";
        if(E0.pari(n) == r) System.out.println("Ottimo! " + n + " è un numero " + pari);
        else System.out.println("Errato! sei sicuro che il risultato sia corretto per " + n + "?");
    }
}
