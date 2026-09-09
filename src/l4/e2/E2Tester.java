package l4.e2;

import java.util.Arrays;

public class E2Tester {
    public static void main(String[] args) {
        test(new int[]{1, 5, 3, 9, 2}, 9);
        test(new int[]{42}, 42);
        test(new int[]{100, 20, 100, 50}, 100);
        test(new int[]{10, 9, 8, 7, 6}, 10);
        test(new int[]{1, 2, 3, 4, 10}, 10);
        test(new int[]{5, 5, 5, 5}, 5);
        test(new int[]{1000, 2500, 50, 1200}, 2500);
        test(new int[]{1, 2}, 2);
        test(new int[]{50, 40}, 50);
        test(new int[]{7, 14, 21, 28, 35}, 35);
    }

    public static void test(int[] arr, int r) {
        int t = E2.max(arr);
        if(t == r) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va... %s dovrebbe dare %s, ma da %s\n", Arrays.toString(arr), r, t);
    }
}
