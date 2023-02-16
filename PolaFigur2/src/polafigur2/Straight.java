/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polafigur2;

/**
 *
 * @author piotr
 */
public class Straight {
    FigureTop Coordinates;
    double A;
    double B;
    double Length;

    public Straight(FigureTop Coordinates) {
        this.Coordinates = Coordinates;
        if (this.Coordinates.getY1() == this.Coordinates.getY()){
            A = 0;
            B = this.Coordinates.getY1();
            if (this.Coordinates.getX1() == this.Coordinates.getX()){
                Length = 0;
            }else if (this.Coordinates.getX1() > this.Coordinates.getX()){
                Length = this.Coordinates.getX1() - this.Coordinates.getX();
            } else {
                Length = this.Coordinates.getX() - this.Coordinates.getX1();
            }
        } else if (this.Coordinates.getX1() == this.Coordinates.getX()){
            A = 0;
            B = 0;
            if (this.Coordinates.getY1() == this.Coordinates.getY()){
                Length = 0;
            }else if (this.Coordinates.getY1() > this.Coordinates.getY()){
                Length = this.Coordinates.getY1() - this.Coordinates.getY();
            } else {
                Length = this.Coordinates.getY() - this.Coordinates.getY1();
            }
        } else {
            A = (this.Coordinates.getY1()-this.Coordinates.getY())/(this.Coordinates.getX1()-this.Coordinates.getX());
            B = this.Coordinates.getY() - A * this.Coordinates.getX();
            Length = Math.sqrt(Math.pow(this.Coordinates.getX()-this.Coordinates.getX1(),2)+Math.pow(this.Coordinates.getY()-this.Coordinates.getY1(),2)); 
            //System.out.println("Długość = " + Length);
        }
        if (Length < 0){
            Length = Length * (-1);
        }
    }

    public FigureTop getCoordinates() {
        return Coordinates;
    }

    public void setCoordinates(FigureTop Coordinates) {
        this.Coordinates = Coordinates;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }
}
