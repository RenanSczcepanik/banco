/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Database {
    public static Connection getConnection() throws SQLException {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/BancoTeste", "usuario", "usuario");
                return conn;
    }
}
