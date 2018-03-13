/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.state.app;

import br.edu.ifpb.treino.state.domain.EmprestimoLivro;
import br.edu.ifpb.treino.state.domain.EmprestimoLivroStateEnum;

/**
 *
 * @author romulo
 */
public class App {
    
    public static void main(String[] args) {
        
        EmprestimoLivro emprestimoLivro = 
                new EmprestimoLivro(EmprestimoLivroStateEnum.INDISPONIVEL);
        emprestimoLivro.emprestarLivro();
        emprestimoLivro.devolverLivro();
        
    }
    
}
