import java.util.Locale;
import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args){
        //Declarando o objeto para poder ter entrada de teclado
        Scanner tecladoUsuario = new Scanner(System.in);

        
        byte idadeVitor = 22;
        byte idadeSabrina = 17;
        Integer diferencaIdade =  idadeVitor - idadeSabrina;
        double numeroQuebradoParaExemplo = 3.6516565165;
        System.out.println(idadeVitor);
        System.out.println(idadeSabrina);
        System.out.println("A Diferença de idade entre nós é: " + diferencaIdade);
        System.out.println("Número sem formatação: " + numeroQuebradoParaExemplo);
        System.out.printf("Número formatado com 2 casas decimais apenas: " + "%.2f %n", numeroQuebradoParaExemplo);
        Locale.setDefault(Locale.US);
        System.out.printf("Número formatado com padrão EUA com 2 casas decimais apenas: " + "%.2f %n", numeroQuebradoParaExemplo);

        String nome = "Vitor";
        float salario = 6000F;
        System.out.printf("%s tem %d anos e ganha %.2f reais por mês %n", nome, idadeVitor, salario);


       //Entrada de dados (String) pelo usuário, usando o Scanner
        System.out.print("Digite sua idade: ");
        String idadeUsuario;
        idadeUsuario = tecladoUsuario.next();
        

        System.out.println("Tá véio em kkkk slc " + idadeUsuario + " de idade");

        //Entrada de dados (int) pelo usuário, usando o Scanner
        int valorUm;
        int valorDois;
        
        System.out.print("Digite um número para somar: ");
        valorUm = tecladoUsuario.nextInt();

        System.out.print("Digite o segundo valor ai man: ");
        valorDois = tecladoUsuario.nextInt();
        tecladoUsuario.close();
        final int mediaDaSomaDosValores = valorUm + valorDois;
        System.out.print("A soma desses valores deu: " + mediaDaSomaDosValores);
        
        



    }
}
