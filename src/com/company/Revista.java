package com.company;

public class Revista extends Item {

    private int edicao;

    public Revista(int edicao) {
        this.edicao = edicao;
    }

    public Revista(String titulo, String autor, int edicao) {
        super(titulo, autor);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: ");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Edição: " + edicao);
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}
