package br.com.devfast.model;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;

    public Endereco(String rua, String numero, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public boolean validar() {
        return rua != null && !rua.isBlank() &&
               numero != null && !numero.isBlank() &&
               bairro != null && !bairro.isBlank();
    }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    @Override
    public String toString() {
        return rua + ", " + numero + " - " + bairro;
    }
} 