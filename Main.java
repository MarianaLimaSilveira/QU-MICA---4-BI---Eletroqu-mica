import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tabelas tabelas = new Tabelas();

        System.out.println("======================================");
        System.out.println("      SIMULADOR DE PILHAS     ");
        System.out.println("======================================\n");

        boolean continuar = true;

        while (continuar) {

            System.out.println("TABELA DE METAIS DISPONÍVEIS:\n");
            for (Metal m : tabelas.getMetais()) {
                System.out.printf("%2d - %-10s (%s) | E° = %.2f V\n",
                        m.getId(), m.getNome(), m.getSimbolo(), m.getPotencialReducao());
            }

            System.out.println("\nEscolha o PRIMEIRO metal: ");
            int id1 = sc.nextInt();
            Metal metal1 = tabelas.getMetalPorId(id1);

            System.out.println("Escolha o SEGUNDO metal: ");
            int id2 = sc.nextInt();
            Metal metal2 = tabelas.getMetalPorId(id2);

            if (metal1 == null || metal2 == null) {
                System.out.println("\nEscolha inválida. Tente novamente.\n");
                continue;
            }

            PilhaCalculator.ResultadoPilha resultado =
                    PilhaCalculator.avaliarPilha(metal1, metal2);

            System.out.println("\n================ RESULTADO ================\n");
            System.out.printf("%s (%s) → E° = %.2f V\n",
                    metal1.getNome(), metal1.getSimbolo(), metal1.getPotencialReducao());
            System.out.printf("%s (%s) → E° = %.2f V\n\n",
                    metal2.getNome(), metal2.getSimbolo(), metal2.getPotencialReducao());

            if (resultado.anodo == null || resultado.catodo == null) {
                System.out.println("A pilha NÃO funciona, pois as espécies são iguais.\n");
            } 
            else {
                System.out.printf("CÁTODO (reduz): %s (%s)\n",
                        resultado.catodo.getNome(), resultado.catodo.getSimbolo());
                System.out.printf("ÂNODO (oxida):  %s (%s)\n\n",
                        resultado.anodo.getNome(), resultado.anodo.getSimbolo());

                if (resultado.potencialPilha > 0) {
                    System.out.printf("POTENCIAL DA PILHA (E°pilha) = %+.2f V\n\n",
                        resultado.potencialPilha);
                }else{
                    System.out.printf("POTENCIAL DA PILHA (E°pilha) = %.2f V\n\n",
                        resultado.potencialPilha);
                }
                

                if (resultado.espontanea) {
                    System.out.println("A pilha é ESPONTÂNEA.");
                } else {
                    System.out.println("A pilha NÃO é espontânea (potencial negativo).");
                }

                System.out.println("\nREAÇÕES BALANCEADAS:\n");
                System.out.println(PilhaCalculator.montarReacao(
                        resultado.anodo, resultado.catodo));
            }

            System.out.println("\n------------------------------------------");
            System.out.print("Deseja calcular outra pilha? (1 - Sim | 2 - Não): ");
            int opcao = sc.nextInt();

            if (opcao != 1) {
                continuar = false;
            }
            System.out.println();
        }

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
