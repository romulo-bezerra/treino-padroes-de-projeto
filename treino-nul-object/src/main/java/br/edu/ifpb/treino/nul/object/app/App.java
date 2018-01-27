/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.nul.object.app;

import br.edu.ifpb.treino.nul.object.domain.Carrinho;
import br.edu.ifpb.treino.nul.object.domain.CarrinhoPromocional;

/**
 *
 * @author romulo
 */
public class App {
 
    public static void main(String[] args) {
        
//        Carrinho carrinho = new CarrinhoNulo();
        
//        System.out.println(carrinho.addProduto("sabão"));
//        System.out.println(carrinho.getProdutos());
//        System.out.println(carrinho.getValorTotal());
//        System.out.println(carrinho.temDesconto());

        Carrinho carrinho = new CarrinhoPromocional();

        System.out.println(carrinho.addProduto("sabão"));
        System.out.println(carrinho.addProduto("milho"));
        System.out.println(carrinho.addProduto("arroz"));
        System.out.println(carrinho.addProduto("feijão"));
        System.out.println(carrinho.addProduto("sabonete"));
        System.out.println(carrinho.getProdutos());
        System.out.println(carrinho.getValorTotal());
        System.out.println(carrinho.temDesconto());
        
    }
    
}
