/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.dao;

import br.com.administradorbanda.entidades.LoginEntidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author elder
 */
public class LoginDAO {
    private Connection conexaoBanco;
    
    public LoginDAO(Connection conexaoBanco) {
        this.conexaoBanco = conexaoBanco;
    }
    
    public LoginEntidade buscarLogin(String usuario, String senha) {
       LoginEntidade login = null;
        
        try {
            if(conexaoBanco != null) {
                String query = "SELECT * FROM login WHERE usuario = ? AND senha = ?";
                
                PreparedStatement statement = conexaoBanco.prepareStatement(query);
                statement.setString(1, usuario);
                statement.setString(2, senha);

                ResultSet resultSet = statement.executeQuery();
                
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String resultUsuario = resultSet.getString("usuario");
                    String resultSenha = resultSet.getString("senha");

                    login = new LoginEntidade(id,resultUsuario, resultSenha);
                }
                
                resultSet.close();
                statement.close();
           } else {
                if(usuario.equals("adm") && senha.equals("adm@123")){
                    login = new LoginEntidade(1,"adm", "adm@123");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return login;
    }
}
