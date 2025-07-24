package br.com.fiap.produtos;

public class Categoria {
    private static long idCounter = 0;
    private Long id;
    private String nome;

    public Categoria(String nome) {
        this.id = ++idCounter;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
