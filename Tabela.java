public class Tabela{

    public String[][] potenciais(){

    String[][] potenciais = {
                {"Li", "3.04"},
                {"Ca", "2.87"},
                {"Na", "2.71"},
                {"Mg", "2.36"},
                {"Al", "1.66"},
                {"Zn", "0.76"},
                {"Fe", "0.44"},
                {"Co", "0.28"},
                {"Ni", "0.25"},
                {"Sn", "0.14"},
                {"Pb", "0.13"},
                {"H2", "0.00"},
                {"Cu", "0.34"},
                {"Ag", "0.80"},
                {"Hg", "0.85"},
                {"Br2", "1.07"},
                {"Cl2", "1.36"},
                {"Au", "1.50"},
                {"F2", "2.87"}
            };

        return potenciais;
    }


    public void obterPotenciais(){
        String [][] potenciais = potenciais();

        for (int i = 0; i < potenciais.length; i++) {
            System.out.println(potenciais[i][0] + " → " + potenciais[i][1] + " V");
        }
    }

   
}