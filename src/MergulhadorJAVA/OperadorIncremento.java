package MergulhadorJAVA;

public class OperadorIncremento {
    public static void main(String[] args) {
        int totalDownloads = 10;
        int novoTotalDownloads;
        // teste
        //totalDownloads = totalDownloads +1;
        //totalDownloads += 1;

        //Incrementando a variavel pos fixada
        //totalDownloads++;

        //Primeiro incrementa e depois atribui
        novoTotalDownloads = ++totalDownloads;

        System.out.println("Total de downloads " + totalDownloads);
        System.out.println("Novo Total de downloads " + novoTotalDownloads);
        System.out.println("Novo de downloads " + novoTotalDownloads);
    }
}
