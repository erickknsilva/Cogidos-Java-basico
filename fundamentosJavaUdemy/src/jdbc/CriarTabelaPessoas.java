/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaDeConexao.getConexao();

        String sql = "CREATE TABLE IF NOT EXISTS pessoas("
                + "codigo INT AUTO_INCREMENT PRIMARY KEY,"
                + "nome varchar(100) NOT NULL"
                + ")";

        Statement st = conexao.createStatement();
        st.execute(sql);

        System.out.print("Tabela criado com sucesso!");
        conexao.close();
    }
}
