// PagamentoPix.java
package br.com.devfast.payment;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public boolean processarPagamento() {
        System.out.println("Gerando chave Pix para o valor de R$ " + String.format("%.2f", getValor()));
        System.out.println("Simulando confirmação instantânea do Pix...");
        setConfirmado(true);
        return true;
    }
}