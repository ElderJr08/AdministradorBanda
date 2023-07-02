/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author elder
 */
public class BancoDeDados {
    private static final String DB_URL = "jdbc:hsqldb:mem:minhaDB";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() {
        Connection conexao = null;
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            conexao = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Conexão bem-sucedida!");
            return conexao;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do HSQLDB não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de conexão com o Banco: " + e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar a conexão: " + e.getMessage());
                }
            }
        }
        
        return null;
    }
}
