import java.util.ArrayList;
import java.util.List;


public class Gerenciador {
    private List<Aluno> alunos;

    public Gerenciador() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }


}