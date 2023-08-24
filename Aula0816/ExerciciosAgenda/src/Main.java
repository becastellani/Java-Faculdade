public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Bernardo Mantoan", "becastell@example.com");
        contato1.setTelefone(new Telefone("19-99905-0946", "VIVO"));
        Endereco endereco1 = new Endereco("Rua da Faculdade",
                "927", "Jardim Santa Maria", "Toledo", "Paraná");


        contato1.setEndereco(endereco1);


        System.out.println("Nome: " + contato1.getNome());
        System.out.println("Email: " + contato1.getEmail());
        System.out.println("Telefone: " + contato1.getTelefone().getNumero());
        System.out.println("Operadora: " + contato1.getTelefone().getOperadora());
        System.out.println(contato1.getEndereco().getRua() + ", " + contato1.getEndereco().getNumero() + ", " +
        contato1.getEndereco().getBairro() + ", " + contato1.getEndereco().getCidade() + ", " + endereco1.getEstado());

    }
}