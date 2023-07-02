/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.dao;

import br.com.administradorbanda.entidades.LoginEntidade;
import java.sql.Connection;
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
                Statement statement = conexaoBanco.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM login WHERE usuario =" + usuario + " AND senha =" + senha);
                
                if(resultSet != null) {
                    int id = resultSet.getInt("id");
                    String resultUsuario = resultSet.getString("usuario");
                    String resultSenha = resultSet.getString("senha");

                    login = new LoginEntidade(id,resultUsuario, resultSenha);
                }
                

                resultSet.close();
                statement.close();
           } else {
                if(usuario.equals("re") && senha.equals("re@123")){
                    login = new LoginEntidade(1,"re", "re@123");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return login;
    }
}
