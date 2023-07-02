/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.dao;

import br.com.administradorbanda.entidades.IntegranteEntidade;
import br.com.administradorbanda.utilitarios.RandomIntGenerator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author elder
 */
public class IntegrantesDAO {
    private Connection conexaoBanco;
    
    public IntegrantesDAO(Connection conexaoBanco) {
        this.conexaoBanco = conexaoBanco;
    }
    
    public ArrayList<IntegranteEntidade> buscarIntegrantes() {
        ArrayList<IntegranteEntidade> integrantes = new ArrayList<>();
        
        try {
            if(conexaoBanco != null) {
                String query = "SELECT * FROM integrantes";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nome = resultSet.getString("nome");
                    String funcao = resultSet.getString("funcao");
                    String banda = resultSet.getString("banda");

                    IntegranteEntidade integrante = new IntegranteEntidade(id, nome, funcao, banda);
                    integrantes.add(integrante);
                }

                resultSet.close();
                statement.close();
           } else {
                IntegranteEntidade integrante = new IntegranteEntidade(1, "Renato", "Guitarrista", "Dupin");
                integrantes.add(integrante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return integrantes;
    }
    
    public ArrayList<IntegranteEntidade> buscarIntegrantesPorNome(String nomeIntegrante) {
        ArrayList<IntegranteEntidade> integrantes = new ArrayList<>();
        
        try {
            if(conexaoBanco != null) {
                String query = "SELECT * FROM integrantes WHERE UPPER(nome) LIKE UPPER(?)";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                statement.setString(1, "%".concat(nomeIntegrante.concat("%")));

                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nome = resultSet.getString("nome");
                    String funcao = resultSet.getString("funcao");
                    String banda = resultSet.getString("banda");

                    IntegranteEntidade integrante = new IntegranteEntidade(id, nome, funcao, banda);
                    integrantes.add(integrante);
                }

                resultSet.close();
                statement.close();
           } else {
                IntegranteEntidade integrante = new IntegranteEntidade(1, "Renato", "Guitarrista", "Dupin");
                integrantes.add(integrante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return integrantes;
    }
    
    public void cadastrarIntegrante(String nome, String funcao, String banda) {
       try {
           if(conexaoBanco != null) {
                String query = "INSERT INTO integrantes (id, nome, funcao, banda) VALUES (?, ?, ?, ?)";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                statement.setInt(1, RandomIntGenerator.generate());
                statement.setString(2, nome);
                statement.setString(3, funcao);
                statement.setString(4, banda);

                int rowsAffected  = statement.executeUpdate();

               if(rowsAffected > 0) {
                    System.out.println("Novo integrante inserido com sucesso");
               }
           }
       }catch (SQLException e) {
           e.printStackTrace();
       }
        
    }
}
