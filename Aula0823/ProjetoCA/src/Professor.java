public class Professor {
    private String nome;
    private String telefone;
    private float valorHora;

    public Professor(String nome, String telefone, float valorHora) {
        this.nome = nome;
        this.telefone = telefone;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        System.out.println("\nProfessor\n" +
                "nome: " + nome + '\n' +
                "telefone: " + telefone + '\n' +
                "valorHora: " + valorHora);
        return "";
    }
}
