import java.util.ArrayList;
import java.util.List;

public class Tabelas {

    private final List<Metal> metais;

    public Tabelas() {
        metais = new ArrayList<>();
        inicializarMetais();
    }

    private void inicializarMetais() {
        metais.add(new Metal(1, "Lítio", "Li", -3.04, 1));
        metais.add(new Metal(2, "Potássio", "K", -2.93, 1));
        metais.add(new Metal(3, "Cálcio", "Ca", -2.87, 2));
        metais.add(new Metal(4, "Sódio", "Na", -2.71, 1));
        metais.add(new Metal(5, "Magnésio", "Mg", -2.37, 2));
        metais.add(new Metal(6, "Alumínio", "Al", -1.66, 3));
        metais.add(new Metal(7, "Zinco", "Zn", -0.76, 2));
        metais.add(new Metal(8, "Ferro", "Fe", -0.44, 2));
        metais.add(new Metal(9, "Níquel", "Ni", -0.25, 2));
        metais.add(new Metal(10, "Chumbo", "Pb", -0.13, 2));
        metais.add(new Metal(11, "Hidrogênio", "H", 0.00, 1));
        metais.add(new Metal(12, "Cobre", "Cu", 0.34, 2));
        metais.add(new Metal(13, "Prata", "Ag", 0.80, 1));
        metais.add(new Metal(14, "Mercúrio", "Hg", 0.85, 2));
        metais.add(new Metal(15, "Platina", "Pt", 1.18, 2));
        metais.add(new Metal(16, "Ouro", "Au", 1.50, 3));
    }

    public List<Metal> getMetais() { return metais; }

    public Metal getMetalPorId(int id) {
        for (Metal m : metais) {
            if (m.getId() == id) return m;
        }
        return null;
    }
}
