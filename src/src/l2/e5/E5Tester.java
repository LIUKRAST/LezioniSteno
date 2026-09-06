package src.l2.e5;

public class E5Tester {
    public static void main(String[] args) {
        test(7);
        test(20);
        test(512);
        test(1028437);
        test(1073);
        test(9);
    }

    public static void test(int n) {
        System.out.println("Inizio congettura...");
        E5.congetturaCollatz(n);
        System.out.println("Fine congettura...");
    }
}
