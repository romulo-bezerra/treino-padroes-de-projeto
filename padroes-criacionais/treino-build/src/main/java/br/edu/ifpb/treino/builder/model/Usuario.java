/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.builder.model;

/**
 *
 * @author romulo
 */
public class Usuario {

    private final String nome;
    private final String sobrenome;
    private final int idade;
    private final String sexo;

    protected Usuario(String nome, String sobrenome, int idade, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", sobrenome=" + sobrenome
                + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

}
