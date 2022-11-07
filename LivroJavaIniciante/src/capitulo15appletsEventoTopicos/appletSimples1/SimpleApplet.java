/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo15appletsEventoTopicos.appletSimples1;

import java.awt.Graphics;
import java.applet.*;
import java.awt.Color;
import java.awt.Font;

/*
<applet code= "SimpleApplet" width= 200 height = 60 </applet>
 */
public class SimpleApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        g.setFont(new Font("Courier new", Font.BOLD, 20));
        g.setColor(Color.yellow);
        g.drawString("Java makes applets easy", 20, 20);
        setBackground(new Color(125, 125, 125));
    }

}
