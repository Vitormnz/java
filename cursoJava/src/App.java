public class App {
    /**
     * @param args
     */
    public static void main(String[] args){
        short idadeVitor = 22;
        short idadeSabrina = 17;
        Integer diferencaIdade =  idadeVitor - idadeSabrina;
        double numeroQuebradoParaExemplo = 3.6516565165;
        System.out.println(idadeVitor);
        System.out.println(idadeSabrina);
        System.out.println("A Diferença de idade entre nós é: " + diferencaIdade);
        System.out.println("Número sem formatação: " + numeroQuebradoParaExemplo);
        System.out.printf("Número formatado com 2 casas decimais apenas: " + "%.2f", numeroQuebradoParaExemplo);


    }
}
