package l3.e2;

public class E2 {
    public static int fib(int n) {
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
        //return 0; // Scrivi qui
    }
}
