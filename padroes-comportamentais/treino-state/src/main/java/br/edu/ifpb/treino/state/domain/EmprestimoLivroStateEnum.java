/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.state.domain;

/**
 *
 * @author romulo
 */
public enum EmprestimoLivroStateEnum implements EmprestimoLivroState {

    DISPONIVEL {
        @Override
        public EmprestimoLivroState emprestarLivro() {
            System.out.println("O livro foi emprestado");
            return INDISPONIVEL;
        }

        @Override
        public EmprestimoLivroState devolverLivro() {
            return DISPONIVEL;
        }

    },
    INDISPONIVEL {
        @Override
        public EmprestimoLivroState emprestarLivro() {
            System.out.println("O livro está indisponível");
            return INDISPONIVEL;
        }

        @Override
        public EmprestimoLivroState devolverLivro() {
            System.out.println("O livro foi devolvido");
            return DISPONIVEL;
        }

    }
}
