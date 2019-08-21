package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Livro livro = new Livro(1, "Projeto Integrador", "Lucas Gabriel", "123", 2019, 10, 500);
        Sistema system1 = new Sistema();

        System.out.println("Bem Vindo a Livraria\n");
        System.out.println("Segue algumas opções de Menu:");
        System.out.println("Cadastrar Livros");
        system1.Cadastrar(livro);
        System.out.println("Consultar livro por código");


        Map<Integer, Livro> listaLivro = new HashMap<>();
        listaLivro.put(1, livro);
        int verificacao = 1;
        for (Integer chave : listaLivro.keySet()) {
            Livro valor = listaLivro.get(chave);

            //verificação se o livro é existente.
            if (verificacao == livro.getCodigo()) {
                System.out.println(valor.toString());
            } else {
                System.out.println("Livro não encontrado");
            }
        }
        //venda do livro.
        livro.venda(1);
    }
}

