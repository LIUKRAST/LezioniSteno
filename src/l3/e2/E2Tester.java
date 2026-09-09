package l3.e2;

public class E2Tester {
    public static void main(String[] args) {
        test(3, 0);
        test(11, 0);
        test(12, 0);
        test(26, 0);
        test(30, 0);
        test(40, 0);
    }

    public static void test(int n, int r) {
        int t = E2.fib(n);
        if(t == r) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va... la serie di fibonacci per %s è %s, non %s\n", n, r, t);
    }
}
