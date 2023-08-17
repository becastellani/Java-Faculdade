public class Telefone {

    private    String numero;
    private String operadora;

    public Telefone(String numero, String operadora) {
        this.setNumero(numero);
        this.setOperadora(operadora);
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

}
