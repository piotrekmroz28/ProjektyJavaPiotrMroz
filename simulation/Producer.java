/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

import java.io.Serializable;

/**
 *
 * @author Jakub
 */
public class Producer extends Company implements Serializable
{
    private int trashAmount;
    private int trashSpeedGenerate;

    public Producer(int x, int y, int trashAmount) 
    {
        super.x = x;
        super.y = y;
        this.trashAmount = trashAmount;
        this.trashSpeedGenerate = (int)(Math.random()*90+10);
    }

    public int getTrashSpeedGenerate()
    {
        return trashSpeedGenerate;
    }

    public void setTrashSpeedGenerate(int trashSpeedGenerate)
    {
        this.trashSpeedGenerate = trashSpeedGenerate;
    }

    public int getTrashAmount()
    {
        return trashAmount;
    }

    public void setTrashAmount(int trashAmount)
    {
        this.trashAmount = trashAmount;
    }

    public void generateTrash()
    {
        this.trashAmount+=trashSpeedGenerate;
    }
    
}
