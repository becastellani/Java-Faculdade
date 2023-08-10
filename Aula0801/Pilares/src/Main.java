import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();

        Aluno aluno1 = new Aluno("Bernardo", 20, "123456");
        Aluno aluno2 = new Aluno("Maria", 19, "789012");

        gerenciador.adicionarAluno(aluno1);
        gerenciador.adicionarAluno(aluno2);

        System.out.println("Alunos cadastrados:");
        gerenciador.exibirAlunos();

        gerenciador.removerAluno(aluno1);

        System.out.println("\nAlunos após remover");

        gerenciador.exibirAlunos();
    }
}