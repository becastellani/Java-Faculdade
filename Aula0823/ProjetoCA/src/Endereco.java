public class Endereco {
    public String logradouro;
    public int numero;
    public String bairro;
    public String complemento;
    public String cidade;
    public String estado;


    public Endereco(String logradouro, String bairro, int numero, String complemento, String cidade, String estado) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        System.out.println("\nEndereco:\n" +
                "logradouro: '" + logradouro +
                "numero: " + numero +
                "bairro: " + bairro + '\n' +
                "complemento: " + complemento + '\n' +
                "cidade= " + cidade + '\n' +
                "estado= " + estado + '\n');
        return "";
    }
}
