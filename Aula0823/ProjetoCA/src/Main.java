public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco(
                "Rua das Azaleias",
                "Ninguem Sabe",
                927,
                "Apt22",
                "Toledo",
                "Parana");


        Aluno aluno1 = new Aluno(
                "Joao Guilherme",
                "60.663.690-0",
                "123.456.892-36",
                "27/02/1998",
                "19-99905-0946",
                endereco1
        );

        Matricula matricula1 = new Matricula(
                "23/08/2023",
                500,
                "101B",
                aluno1
        );


        Professor professor1 = new Professor(
                "Roberta",
                "00-00000-0000",
                100

        );

         Curso curso1 = new Curso(
                 "Engenharia de Software",
                 "23/02/2023",
                 "23/11/2026",
                 "19:30",
                 "22:30",
                 300,
                 "Python e Ruby on Rails",
                 3000,
                 matricula1,
                 professor1
         );


        curso1.toString();

    }
}