/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.template.method.domain;

/**
 *
 * @author romulo
 */
public abstract class Vingadores {

    public void chamarHulk() {
        System.out.println("Chamando hulk...");
        hulkEsmaga();
    }

    protected abstract void hulkEsmaga();

}
