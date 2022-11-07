/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    @SuppressWarnings("unused")
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "";

        // getConnection lança um excecao checada entao é obrigatorio a voce tratar
        Connection conexao = DriverManager.getConnection(url, usuario, "");

        // Criar o statment para executar comando no banco de dados
        // em que foi conectado.
        //nessa classe ele esta conectado no localhost onde roteia todos banco de dados.
        //para poder criar
        Statement st = conexao.createStatement();
        st.execute("CREATE DATABASE curso_java");

        System.out.println("Banco criado com sucesso. ");
        conexao.close();
    }
}
