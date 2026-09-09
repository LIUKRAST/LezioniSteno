package l4.e1;

import java.util.Arrays;

public class E1Tester {
    public static void main(String[] args) {
        test(new char[]{'a', 'b', 'c', 'd'}, 'c', true);
        test(new char[]{'x', 'y', 'z'}, 'a', false);
        test(new char[]{}, 'a', false);
        test(new char[]{'m', 'n', 'o'}, 'm', true);
        test(new char[]{'p', 'q', 'r'}, 'r', true);
        test(new char[]{'A', 'B', 'C'}, 'a', false);
        test(new char[]{'a', '\u0000', 'b'}, '\u0000', true);
        test(new char[]{'!', ' ', '?', '@'}, ' ', true);
        test(new char[]{'Z'}, 'Z', true);
        test(new char[]{'k', 'k', 'k', 'k'}, 'k', true);
    }

    public static void test(char[] arr, char val, boolean r) {
        boolean t = E1.contains(arr, val);
        if(t == r) System.out.println("Ottimo! Test passato");
        else if(r) System.out.printf("Qualcosa non va, %s contiene %s\n", Arrays.toString(arr), val);
        else System.out.printf("Qualcosa non va, %s non contiene %s\n", Arrays.toString(arr), val);
    }
}
