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
public abstract class ReconhecimentoDeErroChain {

    private ReconhecimentoDeErroChain tdec;
    private final IdErro idErro;

    public ReconhecimentoDeErroChain(IdErro idErro) {
        this.idErro = idErro;
    }

    public void setNext(ReconhecimentoDeErroChain proximoErro) {
        if (tdec == null) {
            this.tdec = proximoErro;
        } else {
            this.tdec.setNext(proximoErro);
        }
    }

    public boolean erroIdentificado(IdErro identificacaoErro) {
        return idErro == identificacaoErro;
    }

    public void emitirMensagemDeErro(IdErro identificacaoErro) throws Exception {
        if (erroIdentificado(identificacaoErro)) {
            emitiMensagemDeErro();
        } else {
            if (tdec == null) {
                throw new Exception("Nao há objeto para erro especificado desse efeito.");
            }
            System.out.println("Não sou responsável pelo erro " + identificacaoErro.name() + "...");
            tdec.emitirMensagemDeErro(identificacaoErro);
        }
    }

    protected abstract void emitiMensagemDeErro();

}
