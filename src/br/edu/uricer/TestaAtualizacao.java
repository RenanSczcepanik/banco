/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class TestaAtualizacao {
    public static void main(String[] args) throws SQLException {
        Connection conn = Database.getConnection();
        String sql = "update Pessoas set nome = ? where id = ?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, "XXX");
        stm.setInt(2, 3);
        stm.executeUpdate();
        int updateCount = stm.getUpdateCount();
        System.out.println(updateCount);
        stm.close();
        conn.close();
        
    }
}
