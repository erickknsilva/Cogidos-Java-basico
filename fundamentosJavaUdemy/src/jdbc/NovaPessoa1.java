/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa1 {

    @SuppressWarnings("unused")
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o nome: ");
        String nome = entrada.nextLine();

//        System.out.print("Insira o Id: ");
//        int id = entrada.nextInt();
        Connection conexao = FabricaDeConexao.getConexao();
        /**
         * cria um comando para inserir na tabela pessoas e tem como parametro
         * um argumento coringa que representa um tipo desconhecido. Só tem um
         * parametro porque no código so tem um campo a ser inserido que é nome.
         * "INSERT INTO pessoas (nome) VALUES (?)"; a quantidade de parametro é
         * referente a quantidade de colunas que deseja inserir.
         */
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        /**
         * PreparedStatement eh usado para garantir a segurança ataques Sql
         * injection e atraves do PreparedStatement, vai ser possivel receber
         * por parametros tipos primitivos para ser inserido dentro do Banco de
         * Dados, realizar, consultas, comandos etc.
         *
         * PreparedStatement st = conexao.prepareStatement(sql);
         */
        PreparedStatement st = conexao.prepareStatement(sql);

        /**
         * st.setString(1, nome) o numero 1 significa ao primeiro campo da
         * coluna que eh nome que eh do tipo string.
         *
         * outro exemplo: st.setInt(2, id); o codigo ter 2 parametro e numero 2
         * refere ao segundo parametro da coluna que eh codigo do tipo inteiro
         */
        st.setString(1, nome);
//        st.setInt(2, id);
        st.execute();

        System.out.println("Registro incluindo com sucesso!");
        entrada.close();
    }
}
