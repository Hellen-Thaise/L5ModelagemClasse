package Ex3;
public class Main {


    public static void main(String[] args) {
        ContaCorrente j= new ContaCorrente(123, "Maria Souza",100.0f);
        System.out.println(j.toString());
        j.setNome("João Pedro dos Santos");
        j.deposito(510);
        System.out.println(j.toString());
        j.saque(250);
        System.out.println(j.toString());

    }

}