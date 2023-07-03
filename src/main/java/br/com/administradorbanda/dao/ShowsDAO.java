/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.dao;

import br.com.administradorbanda.entidades.ShowEntidade;
import br.com.administradorbanda.utilitarios.InicializarTabelas;
import br.com.administradorbanda.utilitarios.RandomIntGenerator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author renato
 */
public class ShowsDAO {
    private Connection conexaoBanco;
    
    public ShowsDAO(Connection conexaoBanco) {
        this.conexaoBanco = conexaoBanco;
        InicializarTabelas.criarTabelaShows(conexaoBanco);
    }
    
    public ArrayList<ShowEntidade> buscarShows() {
        ArrayList<ShowEntidade> shows = new ArrayList<>();
        
        try {
            if(conexaoBanco != null) {
                String query = "SELECT * FROM shows";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String local = resultSet.getString("local");
                    String data = resultSet.getString("data");
                    String banda = resultSet.getString("banda");

                    ShowEntidade show = new ShowEntidade(id, local, data, banda);
                    shows.add(show);
                }

                resultSet.close();
                statement.close();
           } else {
                ShowEntidade show = new ShowEntidade(1, "Sao Paulo - SP", "02/07/2023", "Dupin");
                shows.add(show);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return shows;
    }
    
    public ArrayList<ShowEntidade> buscarShowsPorLocal(String localShow) {
        ArrayList<ShowEntidade> shows = new ArrayList<>();
        
        try {
            if(conexaoBanco != null) {
                String query = "SELECT * FROM shows WHERE UPPER(local) LIKE UPPER(?)";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                statement.setString(1, "%".concat(localShow.concat("%")));

                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String local = resultSet.getString("local");
                    String data = resultSet.getString("data");
                    String banda = resultSet.getString("banda");

                    ShowEntidade show = new ShowEntidade(id, local, data, banda);
                    shows.add(show);
                }

                resultSet.close();
                statement.close();
           } else {
                ShowEntidade show = new ShowEntidade(1, "Sao Paulo - SP", "02/07/2023", "Dupin");
                shows.add(show);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return shows;
    }
    
    public void cadastrarShow(String local, String data, String banda) {
       try {
           if(conexaoBanco != null) {
                String query = "INSERT INTO shows (id, local, data, banda) VALUES (?, ?, ?, ?)";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                statement.setInt(1, RandomIntGenerator.generate());
                statement.setString(2, local);
                statement.setString(3, data);
                statement.setString(4, banda);

                int rowsAffected  = statement.executeUpdate();

               if(rowsAffected > 0) {
                    System.out.println("Novo show inserido com sucesso");
               }
           }
       }catch (SQLException e) {
           e.printStackTrace();
       }
        
    }
}
