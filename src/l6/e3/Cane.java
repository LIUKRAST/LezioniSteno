package l6.e3;

public class Cane extends Animale {
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void emettiSuono() {
        System.out.println("Mi chiamo " + getNome() + " e sto abbaiando");
    }
}
