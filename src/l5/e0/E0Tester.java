package l5.e0;

public class E0Tester {
    public static void main(String[] args) {
        test("hello", "world", "helloworld");
        test("", "java", "java");
        test("code", "", "code");
        test("", "", "");
        test("A zi", "!", "A zi!");
        test("Create", "Mod", "CreateMod");
        test("Patapim", "Slim", "PatapimSlim");
        test("123", "456", "123456");
        test("6", "fps", "6fps");
        test("   ", "abc", "   abc");
    }

    public static void test(String a, String b, String res) {
        String t = E0.concat(a, b);
        if(res.equals(t)) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va... {\"%s\", \"%s\"} doveva dare \"%s\", ma ha dato \"%s\"\n", a, b, res, t);
    }
}
