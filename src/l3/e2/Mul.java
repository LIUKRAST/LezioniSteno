package l3.e2;

public class Mul {
    public static void main(String[] args) {
        System.out.println(mul(3, 4));
        System.out.println(mulVisual(3, 4));
    }

    // assumo b positivo
    public static int mul(int a, int b) {
        if(b == 1) return a;
        int in = mul(a, b-1);
        return in + a;
    }

    // assumiamo a = 3, b = 4
    public static int mulVisual(int a, int b) {
        if(b == 1) return a;
        int in;
        innesto: {
             int b1 = b-1; // 3
             if(b1 == 1) {
                 in = a;
                 break innesto;
             }
             int in1;
             innesto1: {
                 int b2 = b1-1; // 2
                 if(b2 == 1) {
                     in1 = a;
                     break innesto1;
                 }
                 int in2;
                 innesto2: {
                     int b3 = b2-1; // 1;
                     if(b3 == 1) {
                         in2 = a;
                         break innesto2;
                     } else throw new IllegalStateException("Impossibile da raggiungere");
                 }
                 in1 = in2 + a;
             }
             in = in1 + a;
        }
        return in + a;
    }
}
