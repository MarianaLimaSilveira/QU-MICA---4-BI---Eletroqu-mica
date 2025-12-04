// Metal.java
public class Metal {
    private final int id;
    private final String nome;
    private final String simbolo;
    private final double potencialReducao;

    public Metal(int id, String nome, String simbolo, double potencialReducao) {
        this.id = id;
        this.nome = nome;
        this.simbolo = simbolo;
        this.potencialReducao = potencialReducao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getPotencialReducao() {
        return potencialReducao;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " (" + simbolo + ")";
    }
}
