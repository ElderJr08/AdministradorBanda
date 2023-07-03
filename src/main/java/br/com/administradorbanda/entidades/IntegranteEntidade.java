/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.entidades;

/**
 *
 * @author Renato Fioroni 
* @author Victor Cachucho 
 */
public class IntegranteEntidade {
    private int id;
    private String nome;
    private String funcao;
    private String banda;

    
    public IntegranteEntidade(int id, String nome, String funcao, String banda){
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.banda = banda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
    
}
