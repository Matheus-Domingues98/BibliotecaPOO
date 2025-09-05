package com.company;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Item> acervo = new ArrayList<>();

    public Biblioteca(List<Item> acervo) {
        this.acervo = acervo;
    }

    public Biblioteca() {
    }

    public void adicionarItem(Item item) {
        acervo.add(item);
    }

    public void removerItem(Item item) {
        acervo.remove(item);
    }

    public void listarItens() {
        System.out.println("----------Acervo da Biblioteca----------");
        if (acervo.isEmpty()) {
            System.out.println("A biblioteca esta vazia.");
            return;
        }
        System.out.println("Lista de Livros: ");
        for(Item item : acervo) {
            item.exibirDetalhes();
        }
    }

    public Item buscarLivroPorTitulo(String titulo) {
        //IgnoreCase serve para que não haja distinção entre letras maiusculas e minusculas;
        for (Item item : acervo) {
            if(item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }
}
