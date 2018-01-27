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
public class CarrinhoNulo extends Carrinho {

    public CarrinhoNulo() {
        
    }

    @Override
    public boolean addProduto(String produto) {
        return false;
    }

    @Override
    public List<String> getProdutos() {
        return new ArrayList<>();
    }

    @Override
    public double getValorTotal() {
        return 0;
    }

    @Override
    public boolean temDesconto() {
        return false;
    }

}
