package Ex2;
public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Hellen Santos", 20, 50.00, 1.60);
        Pessoa p2 = new Pessoa("Paulo Lima", 45, 1.54, 0);
        System.out.println(p.nome);
        p.crescer(0.30);
        System.out.println(p.idade);
        p.envelhecer(2);
        System.out.println(p.peso);
        p.engordar(0.10);
        System.out.println(p.altura);
        System.out.println(p2.nome);
        p.crescer(0.10);
        System.out.println(p2.idade);
        p.envelhecer(2);
        System.out.println(p2.peso);
        p.engordar(0.20);
        System.out.println(p2.altura);

    }

}