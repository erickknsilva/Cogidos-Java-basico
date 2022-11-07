/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TesteConexao {

    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);
//		Connection conexao = FabricaDeConexao.getConexao();
        System.out.println("Conexão efetuada com sucesso.");
        conexao.close();
    }
}
