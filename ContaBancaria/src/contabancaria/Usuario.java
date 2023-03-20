package contabancaria;

import java.util.Scanner;


public class Usuario {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta conta = new Conta();
        
        System.out.println("Bem vindo ao cadastro bancari. Qual seu nome ? ");
        String nome = teclado.next();
        String numero = "8532";
        System.out.println("Olá " + nome + " Essa é sua conta: " + numero);
        
        conta.setNome(nome);
        
        System.out.println("Deseja fazer um deposito inicial ? (s/n)");
        String desejaDepositar = teclado.next();
        
        if("s".equals(desejaDepositar)){
            System.out.println("Qual o valor ? ");
            conta.deposito(teclado.nextDouble());
            System.out.println("Conta gerada com sucesso");
        }else{
            System.out.println("Conta gerada com sucesso");
        }
        
        System.out.println(conta.toString());
        
        System.out.println("Deseja fazer um saque ? (s/n)");
        String saque = teclado.next();
        
        if("s".equals(saque)){
            System.out.println("qual valor do saque ? ");
            conta.saque(teclado.nextDouble());
        }
        teclado.close();
        System.out.println(conta.toString());
    }
}
