package Ex4;

public class Main {
    public static void main(String[] args) {
        Carro meuFusca= new Carro(8);
        meuFusca.adicionarGasolina(50);
        System.out.println(meuFusca.toString());
        meuFusca.andar(300);
        System.out.println(meuFusca.toString());
    }
}
