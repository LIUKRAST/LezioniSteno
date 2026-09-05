package src.l1.e3;

public class E3Tester {
    public static void main(String[] args) {
        test(false, false, false);
        test(false, true, true);
        test(true, false, true);
        test(true, true, false);
    }

    public static void test(boolean a, boolean b, boolean r) {
        boolean t = E3.apriPorta(a,b);
        if(t == r) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va, le leve sono {%s; %s} ma il risultato esce %s invece di %s\n", a,b,t,r);
    }
}
