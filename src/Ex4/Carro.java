package Ex4;

public class Carro {
    Integer portasCarro;
    String modeloCarro;
    String marcaCarro;
    double potenciaCarro;

    public Carro(int portasCarro, String modeloCarro, String marcaCarro, double potenciaCarro) {
    }


    public void ligarCarro() {
        System.out.println("Carro ligado!");
    }

    public void Carro(String marcaCarro, String modeloCarro) {
        System.out.println("O seu carro é: " + marcaCarro + " " + modeloCarro + " com motor " + potenciaCarro);
        ligarCarro();
    }
}
