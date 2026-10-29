// ItemPedido.java
package br.com.devfast.model;

public class ItemPedido {
    private int quantidade;
    private double precoUnitario;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }

    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
}