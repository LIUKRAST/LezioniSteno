package l4.e3;

import java.util.Arrays;

public class E3Tester {
    public static void main(String[] args) {
        copy(new int[]{1, 2, 3, 4, 5});
        copy(new int[]{});
        copy(new int[]{42});
        copy(new int[]{-1, -5, -10});
        copy(new int[]{0, 0, 0});
        copy(new int[]{100, -200, 300, -400});
        copy(new int[]{7, 7, 7, 7, 7});
        copy(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
        copy(new int[]{0, 1, 0, 1, 0});
        copy(new int[]{999999, 888888, 777777});
    }

    public static void copy(int[] arr) {
        int[] t = E3.copy(arr);
        if(Arrays.equals(t, arr)) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va... %s e %s non sono uguali\n", Arrays.toString(arr), Arrays.toString(t));
    }
}
