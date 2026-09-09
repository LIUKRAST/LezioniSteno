package l6.e3;

public class Animale {
    private final String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public void emettiSuono() {
        System.out.println("Mi chiamo " + nome + " e sto emettendo un suono generico!");
    }

    public String getNome() {
        return nome;
    }
}
