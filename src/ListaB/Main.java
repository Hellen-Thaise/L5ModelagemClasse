package ListaB;

public class Main {
    public static void main(String[] args) {

        ListaB1 jardim= new ListaB1();
        jardim.nomeJardim=" Jardim Gabineto ";
        jardim.qtdPlantas= 100;
        jardim.qtdMetrosGramas =300;

        System.out.println("Nome do jardim: " + jardim.nomeJardim);
        System.out.println(jardim.qtdMetrosGramas + " m² ");

        System.out.println("Vai ser utilizado a quantidade de adubo: " + jardim.usarAdubo() + " kg ");
        System.out.println("O valor do adubo é R$: " + jardim.precoAdubo());
        System.out.println("Para cortar a grama o valor é R$ " + jardim.precoCorteGrama());

    }
}
