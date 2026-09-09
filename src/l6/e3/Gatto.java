package l6.e3;

public class Gatto extends Animale {
    public Gatto(String nome) {
        super(nome);
    }

    @Override
    public void emettiSuono() {
        System.out.println("Miagola");
        super.emettiSuono();
    }
}
