package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;


public class Sistema {


    List<Livro> novaLista = new ArrayList<>();


    public void Cadastrar(Livro novoLivro){
        novaLista.add(novoLivro);
        System.out.println(novoLivro.getAutor());
    }
    public void mostrar(int pesquisa) {
        for (Livro valor : novaLista) {
            System.out.println(valor);
        }
    }
}






