/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.builder.app;

import br.edu.ifpb.treino.builder.exceptions.UsuarioBuilderException;
import br.edu.ifpb.treino.builder.model.Usuario;
import br.edu.ifpb.treino.builder.model.UsuarioBuilder;

/**
 *
 * @author romulo
 */
public class App {
    
    public static void main(String[] args) throws UsuarioBuilderException {
        
        UsuarioBuilder usuarioBuilder = new UsuarioBuilder();
        usuarioBuilder.comNome("Rômulo").comSobrenome("Soares").comIdade(21);
        
        Usuario usuarioFinal = usuarioBuilder.toUsuario(); 
        
        System.out.println(usuarioFinal);
        
    }
    
}
