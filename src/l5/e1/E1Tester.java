package l5.e1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class E1Tester {
    public static void main(String[] args) {
        test(new String[]{"a", "b", "c"}, "abc");
        test(new String[]{"hello", " ", "world"}, "hello world");
        test(new String[]{}, null);
        test(null, null);
        test(new String[]{"A zi"}, "A zi");
        test(new String[]{"Create", "Mod", "Minecraft"}, "CreateModMinecraft");
        test(new String[]{"Propants", "", "6fps"}, "Propants6fps");
        test(new String[]{"", "", ""}, "");
        test(new String[]{"Patapim", "Slim"}, "PatapimSlim");
        test(new String[]{"1", "2", "3", "4"}, "1234");
        test(new String[]{" ", " ", " "}, "   ");
        test(new String[]{"Java"}, "Java");
        test(new String[]{"Brr", "Brr", "Patapim"}, "BrrBrrPatapim");
        test(new String[]{"snow"}, "snow");
        test(new String[]{"a", "b", "c", "d", "e"}, "abcde");
    }

    public static void test(String[] arr, String res) {
        String t = E1.concat(arr);
        String arrS = formatArray(arr);
        if(res == null && t == null || t != null && t.equals(res)) System.out.println("Ottimo! Test passato");
        else System.out.printf("Qualcosa non va... %s avrebbe dovuto dare %s, ma ha dato %s\n", arrS, res == null ? "null" : "\"" +res+  "\"", t == null ? "null" : "\""+ t+"\"");
    }

    public static String formatArray(String[] arr) {
        if (arr == null) return "null";

        return Arrays.stream(arr)
                .map(s -> "\"" + s + "\"")
                .collect(Collectors.joining(",", "[", "]"));
    }
}
