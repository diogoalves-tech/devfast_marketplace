package br.com.devfast.model;

public abstract class Usuario {
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public Usuario(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public boolean autenticar(String email, String senha) {
        return this.email.equalsIgnoreCase(email);
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}