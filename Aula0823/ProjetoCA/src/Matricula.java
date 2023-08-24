public class Matricula {
    private String data;
    private float valor;
    private String turma;

    public Aluno aluno;

    public Matricula(String data, float valor, String turma, Aluno aluno) {
        this.data = data;
        this.valor = valor;
        this.turma = turma;
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        System.out.println("\nMatricula\n" +
                "data: " + data + '\n' +
                "valor: "  + valor + '\n' +
                "turma: " + turma);
        aluno.toString();
        return "";
    }
}
