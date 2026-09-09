package l4.e0;

import java.util.Arrays;

public class E0Tester {
    public static void main(String[] args) {
        test(new int[]{1, 2, 3, 4, 5}, 15);
        test(new int[]{}, 0);
        test(new int[]{42}, 42);
        test(new int[]{-7}, -7);
        test(new int[]{0, 0, 0, 0}, 0);
        test(new int[]{-10, 5, 5, -2, 2}, 0);
        test(new int[]{-3, -8, -12, -1}, -24);
        test(new int[]{7, 7, 7, 7}, 28);
        test(new int[]{1000, -500, 2500, -1000}, 2000);
        test(new int[]{15, -3, 8, -20, 4}, 4);
    }

    public static void test(int[] arr, int r) {
        int t = E0.sum(arr);
        if(t == r) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va... %s dovrebbe dare %s, invece ha dato %s\n", Arrays.toString(arr), r, t);
    }
}
