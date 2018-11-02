/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class equipo {
    private String nombre;
    private String estadio;
    private String pais;
    private String entrenador;
    private String dueño;
    private String mascota;
    private String año;
    private String color;
    private ArrayList<jugadores> jugadores=new ArrayList();
    public equipo() {
    }

    public equipo(String nombre, String estadio, String pais, String entrenador, String dueño, String mascota, String año, String color) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.pais = pais;
        this.entrenador = entrenador;
        this.dueño = dueño;
        this.mascota = mascota;
        this.año = año;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<jugadores> getJugadores() {
        return jugadores;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
