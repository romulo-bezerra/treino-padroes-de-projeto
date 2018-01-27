/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.tecnica.hook.methods.app;

import br.edu.ifpb.treino.tecnica.hook.methods.domain.HomemDeFerro;
import br.edu.ifpb.treino.tecnica.hook.methods.domain.Vingadores;

/**
 *
 * @author romulo
 */
public class App {
    
    public static void main(String[] args) {
        
        Vingadores vingadores = new HomemDeFerro();
        
        vingadores.chamarHulk();
        
    }
    
}
