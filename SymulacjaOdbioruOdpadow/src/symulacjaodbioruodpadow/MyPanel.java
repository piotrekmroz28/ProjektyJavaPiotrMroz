/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package symulacjaodbioruodpadow;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JPanel;

/**
 *
 * @author piotr
 */
public class MyPanel extends JPanel
{

    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        for(Producer p: Main.producerCont){
            g.drawRect(p.getX(), p.getY(), 20, 20);
        }
        for(TrashReceiverPoint r: Main.receiverCont){
            g.fillRect(r.getX(), r.getY(), 20, 20);
        }
        for(TrashTruck t: Main.truckCont){
            g.fillOval(t.getX(), t.getY(), 20, 20);
        }
        
    }
    
}
