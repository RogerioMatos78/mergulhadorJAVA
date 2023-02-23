package MergulhadorJAVA;

public class OperadorDecremento {
    public static void main(String[] args) {
        int limiteTentativasLogin = 10;

        int novaTentativaDeLogin = --limiteTentativasLogin;
        //teste
        //limiteTentativasLogin--;
        System.out.println("Limite de tentativas de login " + limiteTentativasLogin);
        System.out.println("Nova tentativas de login " + novaTentativaDeLogin);
    }
}
