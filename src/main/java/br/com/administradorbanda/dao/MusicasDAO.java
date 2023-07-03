/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.dao;

import br.com.administradorbanda.entidades.MusicaEntidade;
import br.com.administradorbanda.utilitarios.InicializarTabelas;
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
public class MusicasDAO {
    private Connection conexaoBanco;
    
    public MusicasDAO(Connection conexaoBanco) {
        this.conexaoBanco = conexaoBanco;
        InicializarTabelas.criarTabelaMusicas(conexaoBanco);
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
    
    public ArrayList<MusicaEntidade> buscarMusicaPorTitulo(String tituloMusica) {
        ArrayList<MusicaEntidade> musicas = new ArrayList<>();
        
        try {
            if(conexaoBanco != null) {
                String query = "SELECT * FROM musicas WHERE UPPER(titulo) LIKE UPPER(?)";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                statement.setString(1, "%".concat(tituloMusica.concat("%")));
                
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
    
    public void cadastrarMusica(String titulo, int duracao, String album, String banda) {
       try {
           if(conexaoBanco != null) {
                String query = "INSERT INTO musicas (id, titulo, duracao, album, banda) VALUES (?, ?, ?, ?, ?)";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                statement.setInt(1, RandomIntGenerator.generate());
                statement.setString(2, titulo);
                statement.setInt(3, duracao);
                statement.setString(4, album);
                statement.setString(5, banda);

                int rowsAffected  = statement.executeUpdate();

               if(rowsAffected > 0) {
                    System.out.println("Nova musica inserida com sucesso");
               }
           }
       }catch (SQLException e) {
           e.printStackTrace();
       }
        
    }
    
}
