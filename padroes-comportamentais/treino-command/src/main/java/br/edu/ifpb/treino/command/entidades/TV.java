/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.command.entidades;

/**
 *
 * @author romulo
 */
public class TV {

    private boolean estado = false;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean ligar() {
        System.out.println("A TV ligou");
        return this.estado = true;
    }

    public boolean desligar() {
        System.out.println("A TV desligou");
        return this.estado = false;
    }

}
