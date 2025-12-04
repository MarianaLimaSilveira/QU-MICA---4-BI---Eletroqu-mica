// PilhaCalculator.java
public class PilhaCalculator {

    public static class ResultadoPilha {
        public final Metal anodo;    
        public final Metal catodo;   
        public final double potencialPilha;
        public final boolean funciona; 
        public ResultadoPilha(Metal anodo, Metal catodo, double potencialPilha, boolean funciona) {
            this.anodo = anodo;
            this.catodo = catodo;
            this.potencialPilha = potencialPilha;
            this.funciona = funciona;
        }
    }


    public static ResultadoPilha avaliarPilha(Metal m1, Metal m2) {
        if (m1 == null || m2 == null) throw new IllegalArgumentException("Metais não podem ser nulos");

        if (m1.getId() == m2.getId()) {
            return new ResultadoPilha(null, null, 0.0, false);
        }

        Metal catodo = m1.getPotencialReducao() >= m2.getPotencialReducao() ? m1 : m2;
        Metal anodo = (catodo == m1) ? m2 : m1;

        double potencial = catodo.getPotencialReducao() - anodo.getPotencialReducao();
        if (potencial < 0) potencial = Math.abs(potencial); 
        return new ResultadoPilha(anodo, catodo, potencial, true);
    }

    public static String montarReacao(Metal anodo, Metal catodo) {
        if (anodo == null || catodo == null) return "A pilha não funciona (mesma espécie escolhida).";

        String s = "";
        s += "ÂNODO (oxidação):\n";
        s += String.format("  %s(s) → %s²⁺(aq) + 2e⁻\n", anodo.getSimbolo(), anodo.getSimbolo());
        s += "\nCÁTODO (redução):\n";
        s += String.format("  %s²⁺(aq) + 2e⁻ → %s(s)\n", catodo.getSimbolo(), catodo.getSimbolo());
        s += "\nREAÇÃO GLOBAL:\n";
        s += String.format("  %s(s) + %s²⁺(aq) → %s²⁺(aq) + %s(s)\n",
                anodo.getSimbolo(), catodo.getSimbolo(),
                anodo.getSimbolo(), catodo.getSimbolo());
        return s;
    }
}
