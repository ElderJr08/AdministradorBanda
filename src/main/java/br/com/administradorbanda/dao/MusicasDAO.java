/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.dao;

import br.com.administradorbanda.entidades.MusicaEntidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            if(conexaoBanco != null) {
                String query = "SELECT * FROM musicas";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery();

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
           } else {
                MusicaEntidade musica = new MusicaEntidade(1, "Master", 400, "Puppets", "Metallica");
                musicas.add(musica);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return musicas;
    }
    
}
