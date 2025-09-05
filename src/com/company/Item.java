package com.company;

public abstract class Item implements ItemBiblioteca {

    protected String titulo;
    protected String autor;

    public Item() {
    }

    public Item(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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

    public abstract String getTipo();
}
