package l2.e1;

public class E1 {
    public static void main(String[] args) {
        int contatore = 0;
        for (int i = 0; i < 1000; i++) {
            int k = i+1;
            if(k%3==0) {
                contatore = contatore+1;
            }
        }
        System.out.println("Il contatore ha trovato " + contatore + " multipli di 3 fino a 1000");
    }
}
