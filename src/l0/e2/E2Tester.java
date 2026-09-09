package l0.e2;

public class E2Tester {
    static void main(String[] args) {
        test(2, 4, 6);
        test(1, 3, 0);
        test(1, 5, -6);
        test(5, 10, 15);
        test(0, 1, -3);
        test(3, 0, 27);
        test(4, 12, 0);
        test(10, 2, 84);
        test(2, 10, -12);
        test(1, 1, 6);
    }

    public static void test(int lingotti, int polli, int risAtteso) {
        int t = E2.gestisciTransazionePollo(lingotti, polli);

        if (t == risAtteso) {
            if(t < 0) System.out.println("Corretto! {" + lingotti + " lingotti, " + polli + " polli} = Resto negativo! Non bastano i soldi.");
            else System.out.println("Corretto! {" + lingotti + " lingotti, " + polli + " polli} = Resto: " + t + " pepite");
        } else {
            System.out.println("Incorretto! {" + lingotti + " lingotti, " + polli + " polli} dovrebbe dare " + risAtteso + ", ma ha dato " + t);
        }
    }
}
