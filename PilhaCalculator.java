public class PilhaCalculator {

    public static class ResultadoPilha {
        public final Metal anodo;
        public final Metal catodo;
        public final double potencialPilha;
        public final boolean espontanea;

        public ResultadoPilha(Metal anodo, Metal catodo, double potencialPilha, boolean espontanea) {
            this.anodo = anodo;
            this.catodo = catodo;
            this.potencialPilha = potencialPilha;
            this.espontanea = espontanea;
        }
    }

    public static ResultadoPilha avaliarPilha(Metal m1, Metal m2) {

        // MESMA ESPÉCIE = pilha não existe
        if (m1.getId() == m2.getId()) {
            return new ResultadoPilha(null, null, 0, false);
        }

        // Maior potencial = cátodo (redução)
        Metal catodo = m1.getPotencialReducao() > m2.getPotencialReducao() ? m1 : m2;
        Metal anodo  = (catodo == m1) ? m2 : m1;


        double potencial = catodo.getPotencialReducao() - anodo.getPotencialReducao();

        // Espontânea se o potencial for positivo
        boolean espontanea = potencial > 0;

        return new ResultadoPilha(anodo, catodo, potencial, espontanea);
    }

    // --------------- BALANCEAMENTO ---------------
    private static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    private static int mmc(int a, int b) {
        return (a * b) / mdc(a, b);
    }

    public static String montarReacao(Metal anodo, Metal catodo) {

        int n1 = anodo.getValencia(); // oxidação
        int n2 = catodo.getValencia(); // redução
        int mmc = mmc(n1, n2);

        int cAnodo  = mmc / n1;
        int cCatodo = mmc / n2;

        String an = cAnodo + anodo.getSimbolo() + " → "
                + cAnodo + anodo.getSimbolo() + "⁺" + n1 + " + "
                + mmc + "e⁻";

        String cat = cCatodo + catodo.getSimbolo() + "⁺" + n2 + " + "
                + mmc + "e⁻ → " + cCatodo + catodo.getSimbolo();

        String global = cAnodo + anodo.getSimbolo() + " + "
                + cCatodo + catodo.getSimbolo() + "⁺" + n2 + " → "
                + cAnodo + anodo.getSimbolo() + "⁺" + n1 + " + "
                + cCatodo + catodo.getSimbolo();

        return "ÂNODO (oxidação): " + an +
               "\nCÁTODO (redução): " + cat +
               "\nREAÇÃO GLOBAL: " + global;
    }
}
