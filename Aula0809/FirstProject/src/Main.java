public class Main {

    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("123456789", "João", "joao@example.com");
        Proprietario proprietario2 = new Proprietario("54344828836", "Bernardo", "bernardo@example.com");


        Carro carro1 = new Carro("FIAT", "Fastback");
        carro1.setProprietario(proprietario1);

        Carro carro2 = new Carro("BMW", "X6");
        carro2.setProprietario(proprietario2);


        System.out.println("Carro 1:");
        System.out.println(carro1.chamarCarro());
        System.out.println("Proprietário: " + carro1.getProprietario().getNome());
        System.out.println("CPF do Proprietário: " + carro1.getProprietario().getCpf());



        System.out.println("\nCarro 2:");
        System.out.println(carro2.chamarCarro());
        System.out.println("Proprietário: " + carro2.getProprietario().getNome());
        System.out.println("CPF do Proprietário: " + carro2.getProprietario().getCpf());

    }
}





