/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package symulacjaodbioruodpadow;

/**
 *
 * @author piotr
 */
public class GarbageTruck {
    int Capability;
    int Speed;
    int LoadSize;
    boolean Busy = false;
    int X;
    int Y;
    int finalX;
    int finalY;

    public GarbageTruck(int Capability, int Speed, int LoadSize, int X, int Y) {
        this.Capability = Capability;
        this.Speed = Speed;
        this.LoadSize = LoadSize;
        this.X = X;
        this.Y = Y;
    }
    
    
    
}
