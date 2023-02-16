/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polafigur2;

/**
 *
 * @author piotr
 */
public class AnswerFromChecked {
    int y;
    boolean checked;
    double yEx;

    public AnswerFromChecked(int y, boolean checked, double yEx) {
        this.y = y;
        this.checked = checked;
        this.yEx = yEx;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public double getyEx() {
        return yEx;
    }
}
