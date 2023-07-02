/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.dao;

import br.com.administradorbanda.entidades.IntegranteEntidade;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                Statement statement = conexaoBanco.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM integrantes");

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nome = resultSet.getString("nome");
                    String funcao = resultSet.getString("funcao");

                    IntegranteEntidade musica = new IntegranteEntidade(id, nome, funcao);
                    integrantes.add(musica);
                }

                resultSet.close();
                statement.close();
           } else {
                IntegranteEntidade integrante = new IntegranteEntidade(1, "Renato", "Guitarrista");
                integrantes.add(integrante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return integrantes;
    }
}
