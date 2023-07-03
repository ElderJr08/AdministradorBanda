/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.utilitarios;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author renato
 */
public class InicializarTabelas {
    
    public static void criarTabelaMusicas(Connection conexaoBanco) {
        try {
             Statement statement = conexaoBanco.createStatement();
             String query = "CREATE TABLE musicas (id INT PRIMARY KEY, titulo VARCHAR(100), duracao INT, album VARCHAR(100), banda VARCHAR(100))";
             statement.executeUpdate(query);
             System.out.println("Tabela musicas criada com sucesso");
        } catch (SQLException e) {}
    }

    public static void criarTabelaLogin(Connection conexaoBanco) {
        try {
            Statement statement = conexaoBanco.createStatement();
            String query = "CREATE TABLE login (id INT PRIMARY KEY, usuario VARCHAR(100), senha VARCHAR(100))";
            statement.executeUpdate(query);
            System.out.println("Tabela login criada com sucesso");
           
            // Inserindo primeiro login
            Statement insertStatement = conexaoBanco.createStatement();
            String insertQuery = "INSERT INTO login (id, usuario, senha) VALUES (1, 're', 're@123')";
            insertStatement.executeUpdate(insertQuery);
            System.out.println("Login inserido com sucesso");
        } catch(SQLException e) {}
    }

    public static void criarTabelaIntegrantes(Connection conexaoBanco) {
        try {
            Statement statement = conexaoBanco.createStatement();
            String query = "CREATE TABLE integrantes (id INT PRIMARY KEY, nome VARCHAR(100), funcao VARCHAR(100), banda VARCHAR(100))";
            statement.executeUpdate(query);
            System.out.println("Tabela integrantes criada com sucesso");
        } catch(SQLException e) {}
        
    }

    public static void criarTabelaShows(Connection conexaoBanco) {
        try {
            Statement statement = conexaoBanco.createStatement();
            String query = "CREATE TABLE shows (id INT PRIMARY KEY, local VARCHAR(100), data VARCHAR(100), banda VARCHAR(100))";
            statement.executeUpdate(query);
            System.out.println("Tabela shows criada com sucesso");
        } catch(SQLException e) {}
    }
}
