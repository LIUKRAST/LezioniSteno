package l0.e0;

public class E0Tester {
    static void main(String[] args) {
        test(22, 25, 23.5f);
        test(7, 22, 14.5f);
        test(14, 3, 8.5f);
        test(29, 11, 20);
        test(5, 18, 11.5f);
        test(21, 30, 25.5f);
        test(2, 16, 9);
        test(25, 9, 17);
        test(12, 27, 19.5f);
        test(1, 19, 10);
        test(-3, 30, 13.5f);
    }

    static void test(float a, float b, float ris) {
        float t = E0.calcolaMedia(a,b);
        float epsilon = 0.05f;
        if(Math.abs(ris - t) < epsilon) { // Se sei curioso di questo check, è perché il float non è sempre perfetto! Per questo il tuo risultato deve essere corretto almeno della prima cifra decimale!
            System.out.println("Esercizio corretto! La media di " + a + " e " + b + " è " + t + ".");
        } else System.out.println("Esercizio errato! Ti esce " + t + " ma la media è " + ris + ". I valori erano " + a + " e " + b + ".");
    }
}
