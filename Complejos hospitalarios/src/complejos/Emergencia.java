/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Emergencia implements Serializable {
    char rango;
    Hospital hospital;
    ArrayList<Paramedico> paramedicos;
    boolean terminada;
    
    //validacion paramedicos, emergencia tratable
    //validacion ambulancia cercana
    
    
}
