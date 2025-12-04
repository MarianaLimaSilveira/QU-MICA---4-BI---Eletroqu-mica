public class Metal {
    private final int id;
    private final String nome;
    private final String simbolo;
    private final double potencialReducao;
    private final int valencia;

    public Metal(int id, String nome, String simbolo, double potencialReducao, int valencia) {
        this.id = id;
        this.nome = nome;
        this.simbolo = simbolo;
        this.potencialReducao = potencialReducao;
        this.valencia = valencia;
    }

    public int getId() {
         return id; }
         
    public String getNome() {
         return nome; }

    public String getSimbolo() {
         return simbolo; }

    public double getPotencialReducao() { 
        return potencialReducao; }

    public int getValencia() { 
        return valencia; }
}
