package l2;

public class NoCrash {
    public static void main(String[] args) {
        while(true) {
            // Il codice non crasha, ma non finisce mai. Infatti non stiamo occupando RAM perché non ci sono operazioni dentro il loop
        }
    }
}
