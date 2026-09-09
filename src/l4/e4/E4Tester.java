package l4.e4;

import l4.e3.E3;

import java.util.Arrays;

public class E4Tester {
    public static void main(String[] args) {
        test(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
        test(new int[]{10, 20, 30, 40}, new int[]{40, 30, 20, 10});
        test(new int[]{}, new int[]{});
        test(new int[]{99}, new int[]{99});
        test(new int[]{-1, -2, -3}, new int[]{-3, -2, -1});
        test(new int[]{0, 0, 0}, new int[]{0, 0, 0});
        test(new int[]{1, -5, 2, -8}, new int[]{-8, 2, -5, 1});
        test(new int[]{7, 7, 7, 7}, new int[]{7, 7, 7, 7});
        test(new int[]{100, 200}, new int[]{200, 100});
        test(new int[]{1, 2, 3, 2, 1}, new int[]{1, 2, 3, 2, 1});
    }

    public static void test(int[] a, int[] res) {
        int[] old = E3.copy(a);
        E4.invert(a);
        if(Arrays.equals(a, res)) System.out.println("Ottimo! Test passato");
        else System.out.printf("%s invertito dovrebbe essere %s, ma è uscito %s", Arrays.toString(old), Arrays.toString(res), Arrays.toString(a));
    }
}
