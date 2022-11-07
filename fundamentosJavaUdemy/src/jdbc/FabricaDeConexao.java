/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//localhost:3306/curso_java?zeroDateTimeBehavior=CONVERT_TO_NULL
public class FabricaDeConexao {

    /**
     * Esse metodo cria uma conexao com o banco de dados apartir do metodo
     * getConexao
     *
     * @return Connection ele tem o tipo de retorno uma conexao
     */
    public static Connection getConexao() {
        try {
            // recebe o endereco do banco de dados
            final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
            // usuario do banco de dados
            final String usuario = "root";
            // senha do banco de dados
            final String senha = "";

            // se todas condicao vor verdadeira ele ira retorna true 
            // e se conectar ao banco de dados
            // se retorna boolean ira lança uma excecao
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            //O metodo getConnection lança uma excecao checada, obrigando a tratar
            //aqui esta tratando a excecao lançada
            throw new RuntimeException(e);
        }

    }

}
