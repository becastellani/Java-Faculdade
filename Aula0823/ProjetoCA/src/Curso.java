public class Curso {

    private String nome;
    private String dataInicio;
    private String dataTermino;

    private String horaInicio;
    private String horaTermino;
    private float cargaHoraria;
    private String conteudo;
    private float valor;

    public Matricula matricula;
    public Professor professor;

    public Curso(String nome,String dataInicio, String dataTermino, String horaInicio, String horaTermino, float cargaHoraria, String conteudo, float valor, Matricula matricula, Professor professor) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.cargaHoraria = cargaHoraria;
        this.conteudo = conteudo;
        this.valor = valor;
        this.matricula = matricula;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        System.out.println(
                "Curso: \nNome: " + nome + '\n' +
                "dataInicio: " + dataInicio + '\n' +
                "dataTermino: " + dataTermino + '\n' +
                "horaInicio: " + horaInicio + '\n' +
                "horaTermino: " + horaTermino + '\n' +
                "cargaHoraria: " + cargaHoraria + '\n' +
                "conteudo: " + conteudo + '\n' +
                "valor: " + valor);
        professor.toString();
        matricula.toString();
        return "";
    }
}
