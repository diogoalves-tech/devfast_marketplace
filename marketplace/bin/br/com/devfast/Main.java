package br.com.devfast.main;

import br.com.devfast.model.*;
import br.com.devfast.payment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEVFAST MARKETPLACE - WALKING SKELETON (SEMANA 3) ===\n");

        // 1. Instanciação de Endereço e Cliente
        Endereco endCliente = new Endereco("Rua Aprígio Veloso", "882", "Universitário");
        Cliente cliente = new Cliente(1, "Diogo", "diogo@email.com", "83999998888", endCliente);

        // 2. Instanciação de Restaurante e Produto
        Endereco endRest = new Endereco("Av. Floriano Peixoto", "100", "Centro");
        Restaurante restaurante = new Restaurante(1, "Monyke", "monyke@email.com", "83988887777", "DevFast Burguer", endRest);
        Produto burger = new Produto(101, "X-DevFast Especial", 28.50, false);

        // 3. Montagem do Pedido
        Pedido pedido = new Pedido(5001, cliente, cliente.getEnderecoPadrao());
        ItemPedido item = new ItemPedido(burger, 2);
        pedido.adicionarItem(item);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Restaurante: " + restaurante.getNomeFantasia());
        System.out.println("Endereço de Entrega: " + pedido.getEnderecoEntrega());
        System.out.println("Item: " + item.getQuantidade() + "x " + burger.getNome());
        System.out.println("Total do Pedido: R$ " + String.format("%.2f", pedido.calcularTotal()));
        System.out.println("Status Inicial: " + pedido.getStatus());
        System.out.println("--------------------------------------------------");

        // 4. Fluxo de Pagamento Polimórfico
        System.out.println("Iniciando pagamento...");
        Pagamento pagamento = new PagamentoPix(pedido.calcularTotal());
        boolean sucesso = pagamento.processarPagamento();

        if (sucesso) {
            pedido.atualizarStatus(StatusPedido.EM_PREPARO);
            System.out.println("Pagamento Aprovado!");
            System.out.println("Novo Status do Pedido: " + pedido.getStatus());
        }

        System.out.println("\n=== EXECUÇÃO CONCLUÍDA COM SUCESSO ===");
    }
}