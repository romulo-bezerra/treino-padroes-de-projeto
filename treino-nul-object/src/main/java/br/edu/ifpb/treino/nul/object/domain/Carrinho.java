/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.nul.object.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author romulo
 */
public abstract class Carrinho {

    protected List<String> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public abstract boolean addProduto(String produto);

    public abstract List<String> getProdutos();

    public abstract double getValorTotal();

    public abstract boolean temDesconto();

}
