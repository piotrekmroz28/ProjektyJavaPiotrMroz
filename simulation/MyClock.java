/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Jakub
 */
public class MyClock extends Thread
{

    JPanel panel;

    public MyClock(JPanel panel)
    {
        this.panel = panel;
    }
    
    
    @Override
    public void run()
    {
        super.run();
        while(true){
            if(GuiForm.simEnd) break;
            try
            {
                sleep(100);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(Producer p: GuiForm.producerCont) 
                p.generateTrash();
            for(TrashTruck t: GuiForm.truckCont )
                t.doTruck();
            panel.repaint();
            //for(TrashReceiverPoint r: GuiForm.receiverCont)
            
        }
    }
    
}
