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
public class CPFInvalido extends ReconhecimentoDeErroChain {

    public CPFInvalido() {
        super(IdErro.cpfInvalido);
    }

    @Override
    protected void emitiMensagemDeErro() {
        System.out.println("CPF inválido. Por favor cheque esse campo.");
    }

}
