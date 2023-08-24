public class Aluno {
    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    public Endereco endereco;


    public Aluno(String nome, String rg, String cpf, String dataNascimento, String telefone, Endereco endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        System.out.println( "\nAluno: " + '\n' +
                "nome: " + nome + '\n' +
                "rg: " + rg + '\n' +
                "cpf: " + cpf + '\n' +
                "dataNascimento: " + dataNascimento + '\n' +
                "telefone: " + telefone + '\n');
                endereco.toString();
                return "";
    }
}
