import java.util.Scanner;

public class PotencialPilha {

    public static Tabelas tabelas = new Tabelas();

    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        tabelas.tabelaDisponiveis();
        int opcao1, opcao2;

        while (true) {
            System.out.print("\nDigite o número do primeiro metal (1-16): ");
            opcao1 = scanner.nextInt();
            
            System.out.print("Digite o número do segundo metal (1-16): ");
            opcao2 = scanner.nextInt();
            
        
            if (opcao1 == opcao2) {
                System.out.println("Os dois metais não podem ser iguais");
                return;
            }else if (opcao1 < 1 || opcao1 > 16 || opcao2 < 1 || opcao2 > 16) {
                System.out.println("Use números de 1 a 16");
                return;
            }else{
                break;
            }
        }
        
        
        determinarResultado(tabelas.obterNomeMetal(opcao1), tabelas.obterSimboloMetal(opcao1), tabelas.obterPotencialMetal(opcao1),
                            tabelas.obterNomeMetal(opcao2), tabelas.obterSimboloMetal(opcao2), tabelas.obterPotencialMetal(opcao2));
        
    }
    
    

    private static void determinarResultado(String nome1, String simbolo1, double potencial1,
                                          String nome2, String simbolo2, double potencial2) {
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("RESULTADO");
        System.out.println("=".repeat(60));
        
        System.out.printf(" %s (%s): E° = %.2f V\n", nome1, simbolo1, potencial1);
        System.out.printf(" %s (%s): E° = %.2f V\n", nome2, simbolo2, potencial2);
        
        String anodo, catodo, simboloAnodo, simboloCatodo;
        double potencialPilha;
     
        if (potencial1 < potencial2) {
            anodo = nome1;
            simboloAnodo = simbolo1;
            catodo = nome2;
            simboloCatodo = simbolo2;
            potencialPilha = potencial2 - potencial1;
        } else {
            anodo = nome2;
            simboloAnodo = simbolo2;
            catodo = nome1;
            simboloCatodo = simbolo1;
            potencialPilha = potencial1 - potencial2;
        }
        
        System.out.println("REAÇÃO DA PILHA:");
        System.out.println("-".repeat(40));
       


        System.out.println("ÂNODO (Oxidação): " + simboloAnodo + "(s) → " + simboloAnodo + "²⁺(aq) + 2e⁻");
        System.out.println("CÁTODO (Redução): " + simboloCatodo + "²⁺(aq) + 2e⁻ → " + simboloCatodo + "(s)");
        
        System.out.println("REAÇÃO GLOBAL DA PILHA:");
        System.out.println(simboloAnodo + "(s) + " + simboloCatodo + "²⁺(aq) → " + simboloAnodo + "²⁺(aq) + " + simboloCatodo + "(s)");

    }

}