public class Cidadao {
    public String nome;
    public String cpf;
    public int idade;
    public String endereco;
    public String IPTU;

    public Cidadao(String nome, String cpf, int idade, String endereco, String IPTU) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
        this.IPTU = IPTU;
    }
    public String criarCidadao() {
        return "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nIdade: " + idade +
                "\nEndereço: " + endereco +
                "\nIPTU: " + IPTU;
    }





}
