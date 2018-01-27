/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.domain;

import br.edu.ifpb.padroes.consts.IdErro;

/**
 *
 * @author romulo
 */
public class NascimentoInvalido extends ReconhecimentoDeErroChain {

    public NascimentoInvalido() {
        super(IdErro.nascimentoInvalido);
    }

    @Override
    protected void emitiMensagemDeErro() {
        System.out.println("Nascimento inválido. Por favor cheque esse campo.");
    }

}
