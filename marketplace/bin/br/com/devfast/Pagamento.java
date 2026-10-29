// Pagamento.java (Classe Abstrata)
package br.com.devfast.payment;

import br.com.devfast.interfaces.Pagavel;

public abstract class Pagamento implements Pagavel {
    private double valor;
    private boolean confirmado;

    public Pagamento(double valor) {
        this.valor = valor;
        this.confirmado = false;
    }

    public double getValor() { return valor; }
    public boolean isConfirmado() { return confirmado; }
    protected void setConfirmado(boolean confirmado) { this.confirmado = confirmado; }
}