/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package capitulo15appletsEventoTopicos.criandoAppletBannerSimple2;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author eric
 */
public class JanelaDeStatus extends Applet {
    
    @Override
    public void paint(Graphics g) {
        g.drawString("Isso está na janela do miniaplicativo", 10, 20);
        showStatus("Isso é mostrado na janela de status <- aqui");
    }
    
}
