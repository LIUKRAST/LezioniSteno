package l1.e2;

public class E2Tester {
    public static void main(String[] args) {
        test(true, false, false, true);
        test(false, true, true, true);
        test(false, true, false, false);
        test(false, false, true, false);
        test(false, false, false, false);
        test(true, true, true, true);
        test(true, true, false, true);
        test(true, false, true, true);
        test(false, false, false, false);
        test(false, true, true, true);
    }

    public static void test(boolean a, boolean b, boolean c, boolean r) {
        boolean t = E2.attivaVentola(a,b,c);
        if(t == r) System.out.println("Ottimo! Test passato");
        else System.out.printf("Peccato, il test per {%s; %s; %s} ha dato %s invece di %s\n", a,b,c,t,r);
    }
}
