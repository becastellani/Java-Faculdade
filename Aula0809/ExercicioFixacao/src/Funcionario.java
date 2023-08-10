class Funcionario extends Cidadao {
    String matricula;
    String cargo;

    public Funcionario(String nome, String cpf,String endereco, int idade,String matricula, String cargo) {
        super(nome, cpf, idade, endereco, null);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public String criarFuncionario(){
            return criarCidadao() +
                        "\nMatricula: " + matricula +
                        "\nCargo: " + cargo
                    ;

    }

}