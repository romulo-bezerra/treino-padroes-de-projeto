/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.app;

import br.edu.ifpb.padroes.domain.Pedido;
import br.edu.ifpb.padroes.domain.Produto;
import br.edu.ifpb.padroes.domain.Transportadora;

/**
 *
 * @author romulo
 */
public class App {

    public static void main(String[] args) {

        Produto p = new Produto(2, 10, "sabão");
        Produto p1 = new Produto(3, 5, "sabonete");
        Produto p2 = new Produto(3, 15, "arroz");

        Pedido pedido = new Pedido(new Transportadora());
        pedido.addProduto(p);
        pedido.addProduto(p1);
        pedido.addProduto(p2);

        System.out.println("O valor que o cliente pagará será de: "
                + pedido.getValorTotal());
    }

}
