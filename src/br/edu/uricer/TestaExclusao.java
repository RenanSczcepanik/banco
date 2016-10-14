/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class TestaExclusao {
    public static void main(String[] args) throws SQLException {
                Connection conn = Database.getConnection();
                
                String sql = "delete from Pessoas where id > 3";
                PreparedStatement stm = conn.prepareStatement(sql);
                stm.execute(sql);
                
                int count = stm.getUpdateCount();
                System.out.println(count + " registros excluidos");
                
                ResultSet resultSet = stm.getGeneratedKeys();
                
                stm.close();
                conn.close();
                        
    }
}
