public class Main {
    public static void main(String[] args){

        Cidadao cidadao01;

        cidadao01 = new Cidadao(
                "Bernardo Mantoan Castellani",
                "123.456.789-00",
                18,
                "Rua da Faculdade, 927",
                "123456"
        );


        System.out.println("Informações do Cidadão:");
        System.out.println(cidadao01.criarCidadao());



        Funcionario funcionario = new Funcionario(
                "João Silva",
                "123.456.789-00",
                "Rua A, 123",
                30, "M12345",
                "Analista");


        System.out.println("\nInformações do Funcionário:\n");
        System.out.println(funcionario.criarFuncionario());
    }


}