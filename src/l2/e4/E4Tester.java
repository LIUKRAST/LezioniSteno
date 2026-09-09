package l2.e4;

public class E4Tester {
    public static void main(String[] args) {
        int[][] testCases = {
                { 50_000_000, 3 },
                { 85_000_000, 7 },
                { 120_000_000, 11 },
                { 200_000_000, 4 },
                { 250_000_000, 13 },
                { 300_000_000, 9 },
                { 350_000_000, 17 },
                { 400_000_000, 6 },
                { 450_000_000, 23 },
                { 500_000_000, 5 }
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("=== TEST #" + (i + 1) + " ===");
            test(testCases[i][0], testCases[i][1]);
            System.out.println();
        }
    }

    public static void test(int n, int m) {
        long startCiclo = System.nanoTime();
        int resCiclo = E4.numeroMultipliCiclo(n, m);
        long endCiclo = System.nanoTime();
        double tempoCicloMs = (endCiclo - startCiclo) / 1_000_000.0;

        long startLogica = System.nanoTime();
        int resLogica = E4.numeroMultipli(n, m);
        long endLogica = System.nanoTime();
        double tempoLogicaMs = (endLogica - startLogica) / 1_000_000.0;

        boolean corretto = (resCiclo == resLogica);

        System.out.println("Input: N = " + n + ", M = " + m);
        System.out.println("Risultato Ciclo: " + resCiclo + " | Tempo: " + tempoCicloMs + " ms");
        System.out.println("Risultato Logica: " + resLogica + " | Tempo: " + tempoLogicaMs + " ms");

        if (corretto) {
            System.out.println("Il risultato è corretto!");
        } else {
            System.out.println("Qualcosa non va, esce " + resLogica + " ma il risultato è " + resCiclo);
        }
    }
}
