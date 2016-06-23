/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import java.util.Timer;

/**
 *
 * @author Admin
 */
public class HiloHora  implements Runnable {
    private JLabel hora;
    String tiempo;
    boolean condicion;
    
    public HiloHora(JLabel hora, boolean condicion){
        this.hora = hora;
        this.condicion = condicion;
    }
    
    public void run(){
        while(condicion){
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("hh:mm:ss");
            hora.setText(f.format(h));
            
            try{
                Thread.sleep(500);
            }catch(InterruptedException ex){
                    
                    }
            
        }
    }
}
