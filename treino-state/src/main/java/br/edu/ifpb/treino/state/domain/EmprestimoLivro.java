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
public class EmprestimoLivro {

    private final EmprestimoLivroState emprestimoLivroState;

    public EmprestimoLivro() {
        this.emprestimoLivroState = EmprestimoLivroStateEnum.DISPONIVEL;
    }

    public EmprestimoLivro(EmprestimoLivroState emprestimoLivroState) {
        this.emprestimoLivroState = emprestimoLivroState;
    }

    public void emprestarLivro() {
        this.emprestimoLivroState.emprestarLivro();
    }

    public void devolverLivro() {
        this.emprestimoLivroState.devolverLivro();
    }

}
