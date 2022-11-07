/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author eric
 */
public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");//dar um titulo pra janela
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//encerrar o compilador quando fechar a janela
        janela.setSize(600, 200);//definir o tamanho da tela
        janela.setLayout(new FlowLayout());//definir uma borda pro botao
        janela.setLocationRelativeTo(null);//centralizar na tela

        JButton botao = new JButton("Cliclar!");//cria um botao
        janela.add(botao);//adiciona o botao na tela

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento ocorreu!");
            }
        });
        janela.setVisible(true);
    }

}
