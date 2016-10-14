/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class TestaSelecao {
    public static void main(String[] args) throws SQLException {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/BancoTeste", "usuario", "usuario");
                String sql = "select * from Pessoas";
                Statement stm = conn.createStatement();
                boolean result = stm.execute(sql);
                System.out.println("resultado " + result);
                
                ResultSet resultSet = stm.getResultSet();
                
                while(resultSet.next()){
                    String nome = resultSet.getString("nome");
                    System.out.println(nome);
                }
                stm.close();
                conn.close();
                resultSet.close();
    }
}
