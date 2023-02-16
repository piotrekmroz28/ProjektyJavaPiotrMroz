/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polafigur2;

import java.awt.Color;
import java.awt.Graphics;
import static polafigur2.Main.figureTop;
import javax.swing.JPanel;

/**
 *
 * @author piotr
 */
public class MyPanel extends JPanel{
    int maxX = 1, maxY = 1;
    int przelicznikWielkosci(){
        double answer1 = 1;
        int answer;
        double wysokosc;
        if (getWidth() > getHeight()){
            wysokosc = (getWidth()/2)-20;
        } else {
            wysokosc = (getHeight()/2)-20;
        }
        if (maxX > maxY){
            answer1 = wysokosc / maxX;
        } else {
            answer1 = wysokosc / maxY;
        }
        answer = (int)answer1;
        //answer = answer +1;
        //System.out.println(answer);
        return answer;
    }

    @Override
    public void paint(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.BLACK);
            g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
            g.drawLine(getWidth() / 2, 0, (getWidth() / 2) - 10, 20);
            g.drawLine(getWidth() / 2, 0, (getWidth() / 2) + 10, 20);
            g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
            g.drawLine(getWidth(), (getHeight() / 2), getWidth() - 20, (getHeight() / 2) - 10);
            g.drawLine(getWidth(), (getHeight() / 2), getWidth() - 20, (getHeight() / 2) + 10);
        for (FigureTop t: Main.figureTop){
            if (Math.abs(t.getX()) > maxX){
                maxX = Math.abs(t.getX());
            }
            if (Math.abs(t.getY()) > maxY){
                maxY = Math.abs(t.getY());
            }
        }    
            
        int przelicznik = przelicznikWielkosci();
            //System.out.println(przelicznik);
        for (int i = 1; i < getWidth()/(przelicznik/2); i++){
            g.drawLine((getWidth() / 2)+i*przelicznik, (getHeight() / 2)+5, (getWidth() / 2)+i*przelicznik, (getHeight() / 2) - 5);
            g.drawLine((getWidth() / 2)-i*przelicznik, (getHeight() / 2)+5, (getWidth() / 2)-i*przelicznik, (getHeight() / 2) - 5);
        }
        for (int i = 1; i < getHeight()/(przelicznik/2); i++){
            g.drawLine((getWidth() / 2)+5, (getHeight() / 2)+i*przelicznik, (getWidth() / 2)-5, (getHeight() / 2)+i*przelicznik);
            g.drawLine((getWidth() / 2)+5, (getHeight() / 2)-i*przelicznik, (getWidth() / 2)-5, (getHeight() / 2)-i*przelicznik);
        }  
        if (!Main.figureTop.isEmpty()){
            for (FigureTop p: Main.figureTop){
                g.drawLine(((getWidth() / 2) + (p.getX()*przelicznik)), ((getHeight()/ 2) + ((p.getY() * (-1))*przelicznik)), ((getWidth() / 2) + (p.getX1()*przelicznik)), ((getHeight()/ 2) + ((p.getY1() * (-1))*przelicznik)));
            } 
        }
    }
}
