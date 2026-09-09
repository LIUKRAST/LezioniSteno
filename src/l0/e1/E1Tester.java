package l0.e1;

public class E1Tester {
    static void main(String[] args) {
        test(1000.0f, 50.0f, 4.0f, 800.0f);
        test(2048.0f, 64.0f, 16.0f, 1024.0f);
        test(500.0f, 30.5f, 2.0f, 439.0f);
        test(10000.0f, 256.0f, 32.0f, 1808.0f);
        test(1500.0f, 100.0f, 15.0f, 0.0f);
        test(800.0f, 12.5f, 8.0f, 700.0f);
        test(3000.0f, 40.0f, 64.0f, 440.0f);
        test(250.0f, 10.0f, 5.2f, 198.0f);
        test(5000.0f, 500.0f, 1.5f, 4250.0f);
        test(1200.0f, 0.0f, 16.0f, 1200.0f);
    }

    public static void test(float a, float b, float c, float ris) {
        float t = E1.calcolaStressRimanente(a, b, c);
        float epsilon = 0.05f;
        if(Math.abs(ris - t) < epsilon) System.out.println("Corretto! {" + a + "; " + b + "; " + c + "} = " + t);
        else System.out.println("Incorretto {" + a + "; " + b + "; " + c + "} dovrebbe dare " + ris + ", ma ha dato " + t);
    }
}
