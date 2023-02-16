/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polafigur2;

/**
 *
 * @author piotr
 */
public class FigureTop {
    int X;
    int Y;
    int X1;
    int Y1;

    public FigureTop(int X, int Y, int X1, int Y1) {
        this.X = X;
        this.Y = Y;
        this.X1 = X1;
        this.Y1 = Y1;
        if (X > X1){
            int Xpos = X;
            int Ypos = Y;
            this.X = X1;
            this.Y = Y1;
            this.X1 = Xpos;
            this.Y1 = Ypos;
        }
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getX1() {
        return X1;
    }

    public void setX1(int X1) {
        this.X1 = X1;
    }

    public int getY1() {
        return Y1;
    }

    public void setX2(int Y1) {
        this.Y1 = Y1;
    }
}
