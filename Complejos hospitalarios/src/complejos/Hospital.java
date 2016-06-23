/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author Admin
 */
public class Hospital implements Serializable {
    String nombre;
    String direccion;
    int paramedicos;
    int ambulancias;
    ArrayList<Character> rangos;
    PriorityQueue<Paramedico> paramedics = new PriorityQueue();
    ArrayList<Ambulancia> ambulancs;
    
    public Hospital(){
        
    }
    
    private static final long serialVersionUID = 7526472295622776147L;

    public Hospital(String nombre, String direccion, int paramedicos, int ambulancias, ArrayList<Character> rangos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.paramedicos = paramedicos;
        this.ambulancias = ambulancias;
        this.rangos = rangos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getParamedicos() {
        return paramedicos;
    }

    public void setParamedicos(int paramedicos) {
        this.paramedicos = paramedicos;
    }

    public int getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(int ambulancias) {
        this.ambulancias = ambulancias;
    }

    public ArrayList<Character> getRangos() {
        return rangos;
    }

    public void setRangos(ArrayList<Character> rangos) {
        this.rangos = rangos;
    }
    
    
    public void addParamedicos(Paramedico para){
        paramedics.add(para);
    }
    
    public void removeParamedicos(Paramedico para){
        paramedics.remove(para);
    }
    
    public void addAmbulancias(Ambulancia amb){
        ambulancs.add(amb);
    }
    
    public void removeAmbulancias(Ambulancia amb){
        ambulancs.remove(amb);
    }
    
    public ArrayList<Ambulancia> getAmbulancs() {
        return ambulancs;
    }

    public PriorityQueue<Paramedico> getParamedics() {
        return paramedics;
    }
    
    
    @Override
    public String toString() {
        return nombre ;
    }

    
    
    
}
