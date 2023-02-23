package MergulhadorJAVA;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int minhaIdade = 45;
        int suaIdade = 43;

        //Subitraçao
        int diferencaIdades = minhaIdade - suaIdade;
        System.out.println("Diferença das Idades " + diferencaIdades);

        //Adiçao
        int somaIdades = minhaIdade + suaIdade;
        System.out.println("Soma das Idades " + somaIdades);

        //Multiplicacao
        int dobroIdades = 2 * suaIdade;
        System.out.println("Dobro das Idades " + dobroIdades);

        //Divisao
        int divisaoIdades = minhaIdade / 2;
        System.out.println("Divisao das Idades " + divisaoIdades);

        //Resto da Divisao módulo
        int moduloresto = 7 % 2;
        System.out.println("Resto da Divisao " + moduloresto);
    }
}
