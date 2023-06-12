package Ex1;

import Ex1.Bola;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bola bola1 = new Bola();
        bola1.cor = "azul";
        System.out.println(bola1.cor);
        System.out.println(bola1.trocarCor("vermelho"));

    }

}