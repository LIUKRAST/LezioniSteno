package l6.e1;

public class E1Tester {
    public static void main(String[] args) {
        test("Fido");
        test("Rex", "fortemente");
        test("Patapim");
        test("Slim");
        test("A zi", "mediamente");
        test("Propants");
        test("");
        test(null);
        test("Bobby");
        test("Lassie");
    }

    public static void test(String nome) {
        Cane cane = new Cane(nome);
        cane.abbaia();
    }

    public static void test(String nome, String forza) {
        Cane cane = new Cane(nome, forza);
        cane.abbaia();
    }
}
