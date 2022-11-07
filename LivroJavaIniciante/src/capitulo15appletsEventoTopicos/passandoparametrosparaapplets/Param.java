/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo15appletsEventoTopicos.passandoparametrosparaapplets;

import java.applet.*;
import java.awt.*;
import javax.swing.JOptionPane;

/*
<applet code="Param" width=300 height=80>
<param name=author value="Hebert Schildt">
<param name=purpose value="Demonstrate Parameters">
<param name=version value=2>
</applet>
 */
public class Param extends Applet {

    String author;
    String purpose;
    int ver;

    @Override
    public void start() {
        String temp;

        author = getParameter("author");
        if (author == null) {
            author = "Nao encontrado.";
        }

        purpose = getParameter("purpose");
        if (purpose == null) {
            purpose = "Nao encontrado";
        }

        temp = getParameter("version");

        try {
            if (temp != null) {
                ver = Integer.parseInt(temp);
            } else {
                ver = 0;
            }
        } catch (NumberFormatException e) {
            ver = -1;
        }
    }

    @Override
    public void paint(Graphics g) {
        purpose = "Demonstracao por parametros";
        author = "Hebert Schildt";
        ver = 2;
        setSize(500, 200);
        g.setColor(Color.PINK);
        setBackground(Color.darkGray);
        g.setFont(new Font("Courier new", Font.BOLD, 20));
        g.drawString("Purpose: " + purpose, 10, 20);
        g.drawString("By: " + author, 10, 40);
        g.drawString("Version: " + ver, 10, 60);
        showStatus("Demonstração por parametros");
    }

}
