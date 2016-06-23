/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Ambulancia implements Serializable {
    String placa;
    int year;
    int velocidad;
    Hospital hospital;
    boolean disponible;

    public Ambulancia(){
        
    }
    
    public Ambulancia(String placa, int year, int velocidad, Hospital hospital, boolean disponible) {
        this.placa = placa;
        this.year = year;
        this.velocidad = velocidad;
        this.hospital = hospital;
        this.disponible = disponible;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Ambulancia{" + "velocidad=" + velocidad + ", hospital=" + hospital + '}';
    }
    
    
    
}
