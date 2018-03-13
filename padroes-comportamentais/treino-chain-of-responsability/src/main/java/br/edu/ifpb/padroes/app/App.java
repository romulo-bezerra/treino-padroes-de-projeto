/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.app;

import br.edu.ifpb.padroes.domain.CPFInvalido;
import br.edu.ifpb.padroes.domain.SexoNaoSelecionado;
import br.edu.ifpb.padroes.consts.IdErro;
import br.edu.ifpb.padroes.domain.NascimentoInvalido;
import br.edu.ifpb.padroes.domain.ReconhecimentoDeErroChain;

/**
 *
 * @author romulo
 */
public class App {
    
    public static void main(String[] args) throws Exception {
        
        ReconhecimentoDeErroChain rdec = new SexoNaoSelecionado();
        rdec.setNext(new CPFInvalido());
        rdec.setNext(new NascimentoInvalido());
        rdec.emitirMensagemDeErro(IdErro.nascimentoInvalido);
        
    }
    
}
