package l2.e2;

public class E2Tester {
    public static void main(String[] args) {
        test(1000, 3, 333);
        test(50, 5, 10);
        test(100, 7, 14);
        test(20, 2, 10);
        test(15, 4, 3);
        test(200, 10, 20);
        test(81, 9, 9);
        test(1, 2, 0);
        test(500, 11, 45);
        test(33, 6, 5);
    }

    public static void test(int n, int m, int r) {
        int t = E2.trovaMultipli(n, m);
        if(t == r) System.out.println("Ottimo! Test superato");
        else System.out.printf("Qualcosa non va... {%s,%s} avrebbe dovuto dare %s, ma ha dato %s\n", n,m,r,t);
    }
}
