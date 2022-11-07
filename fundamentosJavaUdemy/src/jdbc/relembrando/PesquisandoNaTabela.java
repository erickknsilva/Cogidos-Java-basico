/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.relembrando;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eric
 */
public class PesquisandoNaTabela {

    public static void main(String[] args) throws SQLException {
        String url, usuario, senha;
        url = "jdbc:mysql://localhost/hospital?verifyServerCertificated=false&useUSSL=true";
        usuario = "root";
        senha = "";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        String comandoSql = "select * from necroterio";

        PreparedStatement st = conexao.prepareStatement(comandoSql);

        ResultSet resultado = st.executeQuery();

        while (resultado.next()) {
            System.out.print(resultado.getString("nome").trim() + ", ");
            System.out.print(resultado.getString("idade").trim() + ", ");
            System.out.print(resultado.getString("cidade") + "\n");
        }

    }
}
