// Cliente.java
package br.com.devfast.model;

public class Cliente extends Usuario {
    private Endereco enderecoPadrao;

    public Cliente(int id, String nome, String email, String telefone, Endereco enderecoPadrao) {
        super(id, nome, email, telefone);
        this.enderecoPadrao = enderecoPadrao;
    }

    public Endereco getEnderecoPadrao() { return enderecoPadrao; }
    public void setEnderecoPadrao(Endereco enderecoPadrao) { this.enderecoPadrao = enderecoPadrao; }
}