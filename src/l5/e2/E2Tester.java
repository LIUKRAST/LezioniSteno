package l5.e2;

public class E2Tester {
    public static void main(String[] args) {
        test("java", 'a', true);
        test("java", 'z', false);
        test("A zi", 'z', true);
        test("A zi", 'Z', false);
        test("", 'a', false);
        test(null, 'a', false);
        test("Propants", 'P', true);
        test("Propants", 'p', true);
        test("6fps", '6', true);
        test("CreateMod", ' ', false);
        test("  ", ' ', true);
        test("Patapim", 'm', true);
        test("Slim", 'S', true);
        test("snow", 'w', true);
        test("!==", '=', true);
    }

    public static void test(String str, char c, boolean res) {
        boolean t = E2.findChar(str, c);
        if(t == res) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va... {\"%s\", '%s'} avrebbe dovuto dare %s, ma ha dato %s\n", str, c, res, t);
    }
}
