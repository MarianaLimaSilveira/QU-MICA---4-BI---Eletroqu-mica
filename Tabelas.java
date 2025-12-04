// Tabelas.java
import java.util.ArrayList;
import java.util.List;

public class Tabelas {

    private final List<Metal> metais;

    public Tabelas() {
        metais = new ArrayList<>();
        inicializarMetais();
    }

    private void inicializarMetais() {

        metais.add(new Metal(1, "Lítio", "Li", -3.04));
        metais.add(new Metal(2, "Potássio", "K", -2.93));
        metais.add(new Metal(3, "Cálcio", "Ca", -2.87));
        metais.add(new Metal(4, "Sódio", "Na", -2.71));
        metais.add(new Metal(5, "Magnésio", "Mg", -2.37));
        metais.add(new Metal(6, "Alumínio", "Al", -1.66));
        metais.add(new Metal(7, "Zinco", "Zn", -0.76));
        metais.add(new Metal(8, "Ferro", "Fe", -0.44));
        metais.add(new Metal(9, "Níquel", "Ni", -0.25));
        metais.add(new Metal(10, "Chumbo", "Pb", -0.13));
        metais.add(new Metal(11, "Hidrogênio", "H", 0.00));
        metais.add(new Metal(12, "Cobre", "Cu", 0.34));
        metais.add(new Metal(13, "Prata", "Ag", 0.80));
        metais.add(new Metal(14, "Mercúrio", "Hg", 0.85));
        metais.add(new Metal(15, "Platina", "Pt", 1.18));
        metais.add(new Metal(16, "Ouro", "Au", 1.50));
    }

    public List<Metal> getMetais() {
        return metais;
    }

    public Metal getMetalPorId(int id) {
        for (Metal m : metais) {
            if (m.getId() == id) return m;
        }
        return null;
    }

    public String[] getListaExibicao() {
        String[] arr = new String[metais.size()];
        for (int i = 0; i < metais.size(); i++) {
            arr[i] = metais.get(i).toString();
        }
        return arr;
    }

    public Metal getMetalPorIndice(int indice) {
        if (indice < 0 || indice >= metais.size()) return null;
        return metais.get(indice);
    }
}
