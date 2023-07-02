/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author elder
 */
public class MusicasDAO {
    private Connection conexaoBanco;
    
    public MusicasDAO(Connection conexaoBanco) {
        this.conexaoBanco = conexaoBanco;
    }
    
    public ArrayList<MusicaEntidade> buscarMusicas() {
        ArrayList<MusicaEntidade> musicas = new ArrayList<>();
        
        try {
            Statement statement = conexaoBanco.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM musicas");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                int duracao = resultSet.getInt("duracao");
                String album = resultSet.getString("album");
                String banda = resultSet.getString("banda");
                
                MusicaEntidade musica = new MusicaEntidade(id, titulo, duracao, album, banda);
                musicas.add(musica);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return musicas;
    }
    
}
