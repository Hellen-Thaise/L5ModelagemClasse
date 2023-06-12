package Ex3;

public class ContaCorrente {

    private int numero;
    private String nome;
    private float saldo;
    public ContaCorrente(int numero, String nome, float saldo)
    {
        this.numero= numero;
        this.nome= nome;
        this.saldo= saldo;
    }
    public ContaCorrente(int numero, String nome)
    {
        this.numero= numero;
        this.nome= nome;
        this.saldo= 0.0f;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public void deposito(float valor) {
        this.saldo+= valor;
    }
    public void saque(float valor) {
        if(this.saldo>= valor){
            this.saldo-= valor;}
    }

    public String toString() {
        return " Conta [numero=" + numero + ", nome= "+ nome + ", saldo =" + saldo+ "]";
    }



}






