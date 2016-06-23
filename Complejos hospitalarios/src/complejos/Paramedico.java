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
public class Paramedico implements Comparable<Paramedico>, Serializable {
    String nombre;
    int edad;
    String identidad;
    Hospital hospital;
    Ranking rango;
    boolean disponible;
    
    public Paramedico(){
        
    }

    public Paramedico(String nombre, int edad, String identidad, Hospital hospital, Ranking rango, boolean disponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.hospital = hospital;
        this.rango = rango;
        this.disponible = disponible;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ranking getRango() {
        return rango;
    }

    public void setRango(Ranking rango) {
        this.rango = rango;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Paramedico{" + "nombre=" + nombre + ", rango=" + rango + '}';
    }

    @Override
    public int compareTo(Paramedico o) {
        return rango.compareTo(o.rango);
    }
}
