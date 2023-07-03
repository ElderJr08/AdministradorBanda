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
public class ShowEntidade {
    private int id;
    private String local;
    private String data;
    private String banda;
    
    public ShowEntidade(int id, String local, String data, String banda){
        this.id = id;
        this.local = local;
        this.data = data;
        this.banda = banda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
    
}
