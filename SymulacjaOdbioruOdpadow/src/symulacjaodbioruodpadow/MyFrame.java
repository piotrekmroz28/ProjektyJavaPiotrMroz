/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package symulacjaodbioruodpadow;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author piotr
 */
public class MyFrame extends JPanel{

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawLine(10, 10, 10, 1020);
        g.drawLine(10, 1020, 1020, 1020);
        g.drawLine(1020, 1020, 1020, 10);
        g.drawLine(1020, 10, 10, 10);
    }
    
}
