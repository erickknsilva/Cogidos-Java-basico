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

/**
 *
 * @author eric
 */
public class CriarConexao {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Statement st;
        ResultSet resultado;

        String url, usuario, senha;

        //url vai receber o endereco do banco de dados em que vai se conectar.
        url = "jdbc:mysql://localhost/hospital?verifyServerCertificated=false&useUSSL=true";
        //se pessoa tiver um usuario deve colocar no lugar de root
        usuario = "root";
        //se pessoa tiver um senha deve colocar no lugar da string
        senha = "";

        //Vai se concetar com o banco de dados passado pelos parametro de getConnection
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conectado com sucesso.\n");

        String sql = "SELECT * FROM ambulatorio";
        //vai executa comando dentro do banco de dados.
        //Em que foi passado pelo getConnection
        PreparedStatement stmt = conexao.prepareStatement(sql);

        resultado = stmt.executeQuery();
        System.out.println("\t\tTabela " + sql.subSequence(14, sql.length()));
        while (resultado.next()) {
            int nroa = resultado.getInt("nroa");
            int andar = resultado.getInt("andar");
            int capacidade = resultado.getInt("capacidade");

            System.out.printf("\tnroa %d\t    andar %d \tcapacidade %d\n",
                    nroa, andar, capacidade);
        }

        System.out.println();

        String comandoSql2 = "INSERT INTO necroterio( nome, idade, cidade)"
                + " VALUES( ?,  ?,  ?)";

        System.out.print("Insira o nome: ");
        String nomeP = entrada.nextLine();

        System.out.print("Insira a idade: ");
        int idadeP = entrada.nextInt();

        System.out.print("Insira a cidade: ");
        String cidadeP = sc.nextLine();

        PreparedStatement st2 = conexao.prepareStatement(comandoSql2);

        st2.setString(1, nomeP);
        st2.setInt(2, idadeP);
        st2.setString(3, cidadeP);
        st2.execute();

        entrada.close();
    }
}
