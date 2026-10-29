// Pedido.java
package br.com.devfast.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private StatusPedido status;
    private Endereco enderecoEntrega;
    private boolean prioridadeAlta;
    private List<ItemPedido> itens;
    private Cliente cliente;

    public Pedido(int id, Cliente cliente, Endereco enderecoEntrega) {
        this.id = id;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.status = StatusPedido.PENDENTE;
        this.prioridadeAlta = false;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public int getId() { return id; }
    public StatusPedido getStatus() { return status; }
    public Endereco getEnderecoEntrega() { return enderecoEntrega; }
    public Cliente getCliente() { return cliente; }
    public List<ItemPedido> getItens() { return itens; }
}