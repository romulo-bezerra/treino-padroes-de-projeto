/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.domain;

/**
 *
 * @author romulo
 */
public class PAC implements Fretes {

    @Override
    public double calculaFrete(Pedido p) {
        return 15;
    }

}
