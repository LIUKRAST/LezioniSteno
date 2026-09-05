package src.l2;

public class Miliardo {
    public static void main(String[] args) {
        int i = 1;
        int iterazioni = 0;
        while(i < 1_000_000_000) {
            i *= 2;
            iterazioni++;
        }
        System.out.printf("Il codice ha raggiunto %s con %s iterazioni", i, iterazioni);
    }
}
