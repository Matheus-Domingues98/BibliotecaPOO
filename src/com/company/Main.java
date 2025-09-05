package com.company;

public class Main {

    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        Livro livro1 = new Livro("A sutil arte de ligar o foda -se", "Mark Manson", 2016);

        Revista revista1 = new Revista("Chuva", "Globo", 3);

        minhaBiblioteca.adicionarItem(revista1);


        minhaBiblioteca.adicionarItem(livro1);


        minhaBiblioteca.listarItens();
    }
}
