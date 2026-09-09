package l2.e3;

public class E3Tester {
    public static void main(String[] args) {
        test(1, 10, 13);
        test(2, 20, 22);
        test(5, 50, 148);
        test(3, 10, 10);
        test(4, 100, 121);
        test(10, 30, 31);
        test(0, 5, 13);
        test(7, 20, 22);
        test(15, 40, 46);
        test(8, 25, 25);
    }

    public static void test(int s, int m, int r) {
        int t = E3.sali(s,m);
        if(t == r) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va, {%s, %s} avrebbe dovuto dare %s, ma ha dato %s\n", s,m,r,t);
    }
}
