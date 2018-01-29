/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.command.commands;

import br.edu.ifpb.treino.command.entidades.TV;
import br.edu.ifpb.treino.command.interfaces.Command;

/**
 *
 * @author romulo
 */
public class LigarTV implements Command {

    private final TV tv;

    public LigarTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.ligar();
                
    }

}
