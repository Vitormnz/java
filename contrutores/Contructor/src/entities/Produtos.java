package entities;


public class Produtos {
    private String nome;
    private float valor;
    
    public Produtos(String nome, int quantidade, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        return getNome() +"\n"+ 
                  getValor();
    }
}
