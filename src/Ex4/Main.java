package Ex4;

public class Main {
    public static void main(String[] args) {

        Carro car = new Carro(1, "corsa", "chevrolet", 1.0);

        System.out.println("Informações do Carro : ");
        System.out.println("Marca " + car.marcaCarro);
        System.out.println("Modelo " + car.modeloCarro);
        System.out.println("Quantidade de portas " + car.portasCarro);
        System.out.println("Potência do carro" + car.potenciaCarro);

        car.ligarCarro();


    }
}
