/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.nul.object.domain;

import java.util.List;

/**
 *
 * @author romulo
 */
public class CarrinhoPromocional extends Carrinho {

    public CarrinhoPromocional() {
    
    }

    @Override
    public boolean addProduto(String produto) {
        return produtos.add(produto);
    }

    @Override
    public List<String> getProdutos() {
        return produtos;
    }

    @Override
    public double getValorTotal() {
        return 100;
    }

    @Override
    public boolean temDesconto() {
        return produtos.size() >= 5;
    }

}
