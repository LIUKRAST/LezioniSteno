package l2;

public class CrashStack {
    private static long numeroChiamate = 0;
    private static long tempoInizio;

    public static void main(String[] args) {
        tempoInizio = System.currentTimeMillis();
        System.out.println("Inizio riempimento dello Stack...");

        try {
            riempiStack();
        } catch (StackOverflowError e) {
            long tempoFinaleMS = System.currentTimeMillis() - tempoInizio;

            System.out.println("\nBOOM! STACKOVERFLOW RAGGIUNTO!");
            System.out.println("Sopravvissuto per: " + tempoFinaleMS + " ms (" + (tempoFinaleMS / 1000.0) + " secondi)");
            System.out.println("Numero totale di chiamate ricorsive: " + numeroChiamate);
        }
    }

    public static void riempiStack() {
        numeroChiamate++;

        // Stampa il progresso ogni 5.000 chiamate per non rallentare troppo la ricorsione
        if (numeroChiamate % 5000 == 0) {
            System.out.println("Chiamata ricorsiva numero: " + numeroChiamate);
        }

        riempiStack(); // La funzione chiama se stessa all'infinito
    }
}
