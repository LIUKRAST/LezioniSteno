package l3.e2;

public class E2Tester {
    public static void main(String[] args) {
        test(3, 2);
        test(11, 89);
        test(12, 144);
        test(26, 121393);
        test(30, 832040);
        test(40, 102334155);
    }

    public static void test(int n, int r) {
        int t = E2.fib(n);
        if(t == r) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va... la serie di fibonacci per %s è %s, non %s\n", n, r, t);
    }
}
