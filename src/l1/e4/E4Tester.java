package l1.e4;

public class E4Tester {
    public static void main(String[] args) {
        test(0, "Propants dorme in piedi...");
        test(-1, "Propants dorme in piedi...");
        test(1, "Propants ha la carica giusta!");
        test(2, "Propants ha la carica giusta!");
        test(3, "ATTENZIONE: Propants fa esplodere tutto!");
        test(5, "ATTENZIONE: Propants fa esplodere tutto!");
        test(-5, "Propants dorme in piedi...");
        test(10, "ATTENZIONE: Propants fa esplodere tutto!");
        test(1, "Propants ha la carica giusta!");
        test(4, "ATTENZIONE: Propants fa esplodere tutto!");
    }

    public static void test(int n, String r) {
        String t = E4.controllaEnergia(n);
        if(r.equals(t)) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va! Il numero %s non dovrebbe dare \"%s\", ma \"%s\"!\n", n,t,r);
    }
}
