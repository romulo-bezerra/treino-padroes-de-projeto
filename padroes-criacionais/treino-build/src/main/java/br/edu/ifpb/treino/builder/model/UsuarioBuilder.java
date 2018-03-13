/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.treino.builder.model;

import br.edu.ifpb.treino.builder.exceptions.UsuarioBuilderException;

/**
 *
 * @author romulo
 */
public class UsuarioBuilder {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private String sexo;
    
    public UsuarioBuilder(){
    
    }
    
    public UsuarioBuilder comNome(String nome){
        this.nome = nome;
        return this;
    }
    
    public UsuarioBuilder comSobrenome(String sobreNome){
        this.sobrenome = sobreNome;
        return this;
    }
    
    public UsuarioBuilder comIdade(int idade){
        this.idade = idade;
        return this;
    }
    
    public UsuarioBuilder comSexo(String sexo){
        this.sexo = sexo;
        return this;
    }
    
    public Usuario toUsuario() throws UsuarioBuilderException {
        validarUsuario();
        return new Usuario(nome, sobrenome, idade, sexo);
    }
    
    public void validarUsuario() throws UsuarioBuilderException {
        if(nome == null || nome.isEmpty()) {
            throw new UsuarioBuilderException("O atributo obrigatorio nome não"
                    + " está registrado!");
        }
        if(sobrenome == null || sobrenome.isEmpty()) {
            throw new UsuarioBuilderException("O atributo obrigatorio sobrenome"
                    + " não está registrado!");
        }
        if(idade < 18) {
            throw new UsuarioBuilderException("Atributo idade inválido!");
        }
    }
    
}