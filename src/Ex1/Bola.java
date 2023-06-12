package Ex1;

public class Bola {
    Double circunferencia;
    public String cor;
    String marca;
    String material;
    Double velocidade;

    public String trocarCor(String corAlterada) {
        return cor = corAlterada;
    }

    public String mostrarCor()
    {
        return("a cor aletrada é: " + cor);
    }


}
