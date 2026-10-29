// Entregador.java
package br.com.devfast.model;

public class Entregador extends Usuario {
    private boolean disponivel;

    public Entregador(int id, String nome, String email, String telefone) {
        super(id, nome, email, telefone);
        this.disponivel = true;
    }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }
}