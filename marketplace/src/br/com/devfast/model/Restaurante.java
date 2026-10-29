// Restaurante.java
package br.com.devfast.model;

public class Restaurante extends Usuario {
    private String nomeFantasia;
    private Endereco endereco;

    public Restaurante(int id, String nome, String email, String telefone, String nomeFantasia, Endereco endereco) {
        super(id, nome, email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
    }

    public String getNomeFantasia() { return nomeFantasia; }
}