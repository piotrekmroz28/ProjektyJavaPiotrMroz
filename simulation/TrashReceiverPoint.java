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
public class TrashReceiverPoint extends Company implements Serializable
{

    private boolean isBusy;
    private int trashCounter;

    public TrashReceiverPoint(int x, int y, boolean isBusy, int trashCounter)
    {
        super.x = x;
        super.y = y;
        this.isBusy = isBusy;
        this.trashCounter = trashCounter;
    }

    public int getTrashCounter()
    {
        return trashCounter;
    }

    public void setTrashCounter(int trashCounter)
    {
        this.trashCounter = trashCounter;
    }

    public boolean isIsBusy()
    {
        return isBusy;
    }

    public void setIsBusy(boolean isBusy)
    {
        this.isBusy = isBusy;
    }
    
    
}
