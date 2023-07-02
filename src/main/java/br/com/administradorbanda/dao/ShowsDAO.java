/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.dao;

import br.com.administradorbanda.entidades.ShowEntidade;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author elder
 */
public class ShowsDAO {
    private Connection conexaoBanco;
    
    public ShowsDAO(Connection conexaoBanco) {
        this.conexaoBanco = conexaoBanco;
    }
    
    public ArrayList<ShowEntidade> buscarShows() {
        ArrayList<ShowEntidade> shows = new ArrayList<>();
        
        try {
            if(conexaoBanco != null) {
                Statement statement = conexaoBanco.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM shows");

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
}