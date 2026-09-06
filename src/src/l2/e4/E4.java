package src.l2.e4;

public class E4 {

    // NON modificare questa funzione
    public static int numeroMultipliCiclo(int n, int m) {
        int contatore = 0;
        for(int i = 0; i < n; i++) {
            if((i+1)%m==0) contatore++;
        }
        return contatore;
    }

    public static int numeroMultipli(int n, int m) {
        return 0; // Modifica qui
    }
}
