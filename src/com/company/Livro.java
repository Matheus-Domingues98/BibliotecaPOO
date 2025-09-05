package com.company;

public class Livro extends Item {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getTipo() {
        return "Livro";
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao <= 0) {
            throw new IllegalArgumentException("O ano de publicação não pode ser negativo.");
        } else {
            this.anoPublicacao = anoPublicacao;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Livro: ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);

    }
}
