/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class HiloHora  implements Runnable {
    private JLabel hora;
    String tiempo;
    ArrayList<String> timeUp;
    
    public HiloHora(JLabel hora){
        this.hora = hora;
        if(timeUp == null)
            timeUp = new ArrayList();
    }
    
    public void inicioProceso (int duracion) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
        Date d = df.parse(hora.getText()); 
        Calendar gc = new GregorianCalendar();
        gc.setTime(d);
        gc.add(Calendar.SECOND, duracion);
        Date d2 = gc.getTime();
        timeUp.add(df.format(d2));
    }
    
    public void run(){
        while(true){
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("hh:mm:ss");
            
            hora.setText(f.format(h));
            tiempo  = hora.getText();
            for (int i = 0; i < timeUp.size(); i++) {
                if(((String)timeUp.get(i)).equals(tiempo)){
                    timeUp.remove(timeUp.indexOf(i));
                }
                    
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException ex){
                    
                    }
            
        }
    }
}
