package l6.e2;

public class Robot {
    private String nome;
    private final int numeroSeriale;

    public Robot(String nome, int numeroSeriale) {
        this.nome = nome;
        this.numeroSeriale = numeroSeriale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
