package l4.e5;

import java.util.Arrays;

public class E5Tester {
    public static void main(String[] args) {
        test(new char[]{'a', 'b', 'c'}, new char[]{'a', 'b', 'c'}, true);
        test(new char[]{'a', 'b', 'c'}, new char[]{'a', 'b', 'd'}, false);
        test(new char[]{}, new char[]{}, true);
        test(new char[]{'a', 'b'}, new char[]{'a', 'b', 'c'}, false);
        test(new char[]{'a', 'b', 'c'}, new char[]{'a', 'b'}, false);
        test(new char[]{'X'}, new char[]{'X'}, true);
        test(new char[]{'A'}, new char[]{'a'}, false);
        test(new char[]{'1', ' ', '!'}, new char[]{'1', ' ', '!'}, true);
        test(new char[]{'\u0000', 'a'}, new char[]{'\u0000', 'a'}, true);
        test(new char[]{'x', 'y', 'z'}, new char[]{'z', 'y', 'x'}, false);
    }

    public static void test(char[] a, char[] b, boolean res) {
        boolean t = E5.equals(a, b);
        if(t == res) System.out.println("Ottimo! Test passato");
        else if(res) System.out.printf("Qualcosa non va, %s e %s sono uguali\n", Arrays.toString(a), Arrays.toString(b));
        else System.out.printf("Qualcosa non va, %s e %s non sono uguali\n", Arrays.toString(a), Arrays.toString(b));
    }
}
