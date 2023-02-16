/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polafigur2;

import java.util.ArrayList;
import static polafigur2.Main.everyPoints;
import static polafigur2.Main.figureTop;
import static polafigur2.Main.pointsOnLine;
import static polafigur2.Main.straight;

/**
 *
 * @author piotr
 */
public class Quadrangle {
    double pow;
    int maxX, minX, nInside;
    static ArrayList<Points> chosePoints;
    
    
    static private AnswerFromChecked  sprRow(Straight s, int x){
        // postanowiłem wziąc pod uwage błędy procesu zapisu liczb w pamięci
        double y = s.getA() * x + s.getB();
        double yClos = Math.round(y);
        boolean checked = false;
        if ((yClos - y) > 0 ){
            if ((yClos - y) < 0.0001){
                checked = true;
            }
        } else {
            if ((yClos - y) < 0.0001){
                checked = true;
            }
        }
        AnswerFromChecked respond = new AnswerFromChecked((int)yClos, checked, y);
        return respond;
    }
    
    static private boolean checkExistPoints(PointsOnLine p){
        boolean respond = false;
        for (PointsOnLine t: pointsOnLine){
            if (p.getX() == t.getX() && p.getY() == t.getY()){
                respond = true;
            }
        }
        return respond;
    }
    
    static private boolean checkExistPoints2(Points p){
        boolean respond = false;
        for (Points t: chosePoints){
            if (p.getX() == t.getX() && p.getY() == t.getY()){
                respond = true;
            }
        }
        return respond;
    }
    
    public Quadrangle() {
        nInside = 0;
        chosePoints = new ArrayList();
        int licznik = 0;
        for (FigureTop t: figureTop){
            if (licznik == 0){
                maxX = t.getX();
                minX = t.getX();
            } else {
                if (t.getX() > maxX){
                    maxX = t.getX();
                }
                if (t.getX() < minX){
                    minX = t.getX();
                }    
            }
            licznik++;
        }
        if (maxX == minX){
            pow = 0;
        } else {
            for(int i = minX; i <= maxX; i++){
                for (FigureTop t: figureTop){
                    if(t.getX() <= i && i <= t.getX1()){
                        if (t.getX() == i || t.getX1() == i){
                            if(t.getX() == t.getX1()){
                                if(t.getY() > t.getY1()){
                                    for(int j = t.getY1(); j <= t.getY(); j++){
                                        PointsOnLine checked = new PointsOnLine(t.getX(), j);
                                        if (!checkExistPoints(checked)){
                                            pointsOnLine.add(checked);
                                        }
                                    }
                                } else {
                                    for(int j = t.getY(); j <= t.getY1(); j++){
                                        PointsOnLine checked = new PointsOnLine(t.getX(), j);
                                        if (!checkExistPoints(checked)){
                                            pointsOnLine.add(checked);
                                        }
                                    }
                                }    
                            } else {
                                if (t.getX() == i){
                                    PointsOnLine checked = new PointsOnLine(t.getX(), t.getY());
                                    if (!checkExistPoints(checked)){
                                        pointsOnLine.add(checked);
                                    }
                                } else {
                                    PointsOnLine checked = new PointsOnLine(t.getX1(), t.getY1());
                                    if (!checkExistPoints(checked)){
                                        pointsOnLine.add(checked);
                                    }
                                }
                            }
                        } else {
                            Straight straightTemp = new Straight(t);
                            AnswerFromChecked answer = sprRow(straightTemp,i);
                            if(answer.isChecked()){
                                PointsOnLine checked = new PointsOnLine(i, answer.getY());
                                if (!checkExistPoints(checked)){
                                        pointsOnLine.add(checked);
                                }
                            }
                            Points point = new Points(i, answer.getyEx());
                            boolean a = false;
                            for (Points s: everyPoints){
                                if(s.getX() == point.getX() && s.getY() == point.getY()){
                                    a = true;
                                }
                            }
                            if (a == false){
                                everyPoints.add(point);
                            }
                        }
                    }
                }
            }
            // obliczenie ilosci punktów wewnątrz
            
            for(int i = minX + 1; i < maxX; i++){
                
                int l = 0;
                Points nr1 = new Points(), nr2 = new Points();
                for(Points s: everyPoints){
                    if (s.getX() == i){
                        if(l == 0){
                            nr1.setX(i);
                            nr1.setY(s.getY());
                            l++;
                            //System.out.println("Współrzędne Nr1: X=" + nr1.getX() + " Y=" + nr1.getY());
                        } else {
                            nr2.setX(i);
                            nr2.setY(s.getY());
                            //System.out.println("Współrzędne N2: X=" + nr2.getX() + " Y=" + nr2.getY());
                        }
                    }
                }
                nr1.setY(Math.ceil(nr1.getY()));
                nr2.setY(Math.ceil(nr2.getY()));
                if (nr1.getY()>nr2.getY()){
                    
                    for (double j = nr2.getY()+1; j < nr1.getY(); j++){
                        //System.out.println("Jestem Tu");
                        nInside++;
                    }
                } else {
                    for (double j = nr1.getY()+1; j < nr2.getY(); j++){
                        nInside++;
                    }
                }
                
            }
            pow = nInside + (pointsOnLine.size()/2) - 1;
            //System.out.println("" + pow);
        }
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }
}
