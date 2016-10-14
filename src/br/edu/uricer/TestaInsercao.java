/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
                Connection conn = Database.getConnection();
                
                String sql = "insert into Pessoas (nome) values (?)";
                PreparedStatement stm = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                stm.setString(1, "Homens Bomba");
                boolean result = stm.execute();
                System.out.println("Resultado " + result);
                
                ResultSet resultSet = stm.getGeneratedKeys();
                
                while(resultSet.next()){
                    Integer id = resultSet.getInt(1);
                    System.out.println(id);
                }
                stm.close();
                resultSet.close();
                conn.close();
                        
    }
}
