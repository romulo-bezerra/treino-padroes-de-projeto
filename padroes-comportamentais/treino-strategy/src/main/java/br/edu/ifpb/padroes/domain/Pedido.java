/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author romulo
 */
public class Pedido {

    private final Fretes frete;
    private final List<Produto> produtos;

    public Pedido(Fretes frete) {
        this.frete = frete;
        produtos = new ArrayList<>();
    }

    public boolean addProduto(Produto p) {
        return this.produtos.add(p);
    }

    public boolean rmProduto(Produto p) {
        return this.produtos.remove(p);
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public double getValorTotal() {
        return frete.calculaFrete(this) + getPrecoProdutos();
    }

    public double getPesoTotal() {
        double retorno = 0;
        for (Produto p : produtos) {
            retorno += p.getPeso();
        }
        return retorno;
    }

    public double getPrecoProdutos() {
        double retorno = 0;
        for (Produto p : produtos) {
            retorno += p.getPreco();
        }
        return retorno;
    }

}
