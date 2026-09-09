package l3.e0;

public class E0Tester {
    public static void main(String[] args) {
        test(3, 2, 3.605551275463989d);
        test(0,0, 0);
        test(-1, 12, 12.041594578792296d);
        test(44, 6, 44.40720662234904d);
        test(2083, -4865, 5292.1747892525245);
        test(3.5d, 5.44d, 6.468662922119224);
    }

    public static void test(double a, double b, double r) {
        double t = E0.pitagora(a,b);
        double epsilon = 0.0005f;

        if(Math.abs(r-t) < epsilon) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va! {%s,%s} dovrebbe dare %s, ma da %s\n", a, b, r, t);
    }
}
