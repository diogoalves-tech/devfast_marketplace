// Produto.java
package br.com.devfast.model;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private boolean fragil;

    public Produto(int id, String nome, double preco, boolean fragil) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.fragil = fragil;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public boolean isFragil() { return fragil; }
}