package l6.e1;

public class Cane {
    private final String nome;
    private final String forza;

    public Cane(String nome, String forza) {
        this.nome = nome;
        this.forza = forza;
    }

    public Cane(String nome) {
        this(nome, "leggermente");
    }

    public void abbaia() {
        System.out.println("Io sono " + this.nome + " e sto abbaiando " + forza + "!!");
    }
}
