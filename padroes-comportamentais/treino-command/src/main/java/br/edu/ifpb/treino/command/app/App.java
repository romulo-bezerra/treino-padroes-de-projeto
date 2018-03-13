/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.command.app;

import br.edu.ifpb.treino.command.commands.DesligarTV;
import br.edu.ifpb.treino.command.commands.LigarTV;
import br.edu.ifpb.treino.command.entidades.TV;
import br.edu.ifpb.treino.command.invoker.ControleRemoto;

/**
 *
 * @author romulo
 */
public class App {
    
    public static void main(String[] args) {
        
        TV tv = new TV();
        
        LigarTV ligarTV = new LigarTV(tv);
        DesligarTV desligarTV = new DesligarTV(tv);
        
        ControleRemoto cr = new ControleRemoto();
        cr.addCommandLigar(ligarTV);
        cr.addCommandDesligar(desligarTV);
        
        cr.ligarCommands();
        cr.DesligarCommands();
        
    }
    
}
