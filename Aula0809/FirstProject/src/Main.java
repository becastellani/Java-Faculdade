public class Main {

    public static void main(String[] args) {
        Carro carro, carro1;
        carro = new Carro("FIAT", "Fastback");
        carro1 = new Carro("BMW", "X6");


        System.out.println(carro.chamarCarro());
        System.out.println(carro1.chamarCarro());
    }



}

