package contabancaria;


public class Conta {
    private String nome;
    private String numero;
    private double saldo;

    public Conta(){
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void deposito(double deposito){
        saldo += deposito;
    }
    
    public void saque(double saque){
       saldo -= saque + 5.0;
    }
    
    @Override
    public String toString(){
        return "Dados da conta \n" + getNome() + " numero da conta: " + getNumero() +" seu saldo: "+getSaldo();
    }
}
