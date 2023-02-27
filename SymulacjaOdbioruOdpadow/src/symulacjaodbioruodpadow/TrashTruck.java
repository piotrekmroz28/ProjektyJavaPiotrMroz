/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package symulacjaodbioruodpadow;

import java.io.Serializable;

/**
 *
 * @author piotr
 */
public class TrashTruck implements Serializable
{
    private int x;
    private int y;
    private int trashLoad;
    private int maxLoad;
    private Company target;

    public TrashTruck(int x, int y, int trashLoad, int maxLoad)
    {
        this.x = x;
        this.y = y;
        this.trashLoad = trashLoad;
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad()
    {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad)
    {
        this.maxLoad = maxLoad;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getTrashLoad()
    {
        return trashLoad;
    }

    public void setTrashLoad(int trashLoad)
    {
        this.trashLoad = trashLoad;
    }
    
    public void doTruck(){
        if(target != null)
        {
            if(target.getX()>this.x)
                this.x++;
            if(target.getX()<this.x)
                this.x--;
            if(target.getY()>this.y)
                this.y++;
            if(target.getY()<this.y)
                this.y--;  
            
            if(target.getX()== x && target.getY() == y)
                System.out.println("Pojazd u celu");         
           /* if(target instanceof Producer) //rozwiązanie nie do końca zalecane
            {
                Producer p = (Producer)target; 
                p.getX()
            }
           */        
        }
        else
        {
            if(Main.producerCont.size() > 0)
            {
                target = Main.producerCont.get(0);
            }
                
        }
    }
}
