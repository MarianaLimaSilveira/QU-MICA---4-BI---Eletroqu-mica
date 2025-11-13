public class Tabelas {
    public Tabelas(){
    }

    public static void tabelaDisponiveis(){
        System.out.println("METAS DISPONÍVEIS:");
        System.out.println(" 1. Lítio (Li)");
        System.out.println(" 2. Potássio (K)");
        System.out.println(" 3. Cálcio (Ca)");
        System.out.println(" 4. Sódio (Na)");
        System.out.println(" 5. Magnésio (Mg)");
        System.out.println(" 6. Alumínio (Al)");
        System.out.println(" 7. Zinco (Zn)");
        System.out.println(" 8. Ferro (Fe)");
        System.out.println(" 9. Níquel (Ni)");
        System.out.println("10. Chumbo (Pb)");
        System.out.println("11. Hidrogênio (H)");
        System.out.println("12. Cobre (Cu)");
        System.out.println("13. Prata (Ag)");
        System.out.println("14. Mercúrio (Hg)");
        System.out.println("15. Platina (Pt)");
        System.out.println("16. Ouro (Au)");
    }

    public static String obterNomeMetal(int opcao) {
        switch (opcao) {
            case 1: return "Lítio";
            case 2: return "Potássio";
            case 3: return "Cálcio";
            case 4: return "Sódio";
            case 5: return "Magnésio";
            case 6: return "Alumínio";
            case 7: return "Zinco";
            case 8: return "Ferro";
            case 9: return "Níquel";
            case 10: return "Chumbo";
            case 11: return "Hidrogênio";
            case 12: return "Cobre";
            case 13: return "Prata";
            case 14: return "Mercúrio";
            case 15: return "Platina";
            case 16: return "Ouro";
            default: return "Desconhecido";
        }
    }
    
    
    public static String obterSimboloMetal(int opcao) {
        switch (opcao) {
            case 1: return "Li";
            case 2: return "K";
            case 3: return "Ca";
            case 4: return "Na";
            case 5: return "Mg";
            case 6: return "Al";
            case 7: return "Zn";
            case 8: return "Fe";
            case 9: return "Ni";
            case 10: return "Pb";
            case 11: return "H";
            case 12: return "Cu";
            case 13: return "Ag";
            case 14: return "Hg";
            case 15: return "Pt";
            case 16: return "Au";
            default: return "?";
        }
    }
    
    
    public static double obterPotencialMetal(int opcao) {
        switch (opcao) {
            case 1: return -3.04;  // Lítio
            case 2: return -2.93;  // Potássio
            case 3: return -2.87;  // Cálcio
            case 4: return -2.71;  // Sódio
            case 5: return -2.37;  // Magnésio
            case 6: return -1.66;  // Alumínio
            case 7: return -0.76;  // Zinco
            case 8: return -0.44;  // Ferro
            case 9: return -0.25;  // Níquel
            case 10: return -0.13; // Chumbo
            case 11: return 0.00;  // Hidrogênio
            case 12: return 0.34;  // Cobre
            case 13: return 0.80;  // Prata
            case 14: return 0.85;  // Mercúrio
            case 15: return 1.18;  // Platina
            case 16: return 1.50;  // Ouro
            default: return 0.0;
        }
    }

}
