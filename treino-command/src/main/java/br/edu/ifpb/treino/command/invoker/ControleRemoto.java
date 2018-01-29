/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.command.invoker;

import br.edu.ifpb.treino.command.interfaces.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author romulo
 */
public class ControleRemoto {

    private final List<Command> commandsLigar;
    private final List<Command> commandsDesligar;

    public ControleRemoto() {
        this.commandsLigar = new ArrayList<>();
        this.commandsDesligar = new ArrayList<>();
    }

    public boolean addCommandLigar(Command command) {
        return this.commandsLigar.add(command);
    }

    public boolean addCommandDesligar(Command command) {
        return this.commandsDesligar.add(command);
    }

    public void ligarCommands() {
        for (Command c : commandsLigar) {
            c.execute();
        }
    }

    public void DesligarCommands() {
        for (Command c : commandsDesligar) {
            c.execute();
        }
    }

}
