/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class pateador extends jugadores {

    private double patada;
    private double fuerza;
    private double regateadora;

    public pateador() {
    }
    static Scanner sc = new Scanner(System.in);
    static ArrayList<equipo> equipos = new ArrayList();

    public pateador(double patada, double fuerza, double regateadora, String nombre, String apodo, String numero, String equiFavfut, String equiFavBas, String jugfav, String mayor, String anio, double estrellas) {
        super(nombre, apodo, numero, equiFavfut, equiFavBas, jugfav, mayor, anio, estrellas);
        this.patada = patada;
        this.fuerza = fuerza;
        this.regateadora = regateadora;
    }

    public double getPatada() {
        return patada;
    }

    public void setPatada(double patada) {
        this.patada = patada;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getRegateadora() {
        return regateadora;
    }

    public void setRegateadora(double regateadora) {
        this.regateadora = regateadora;
    }

    @Override
    public double atacar() {
        return ((patada + fuerza + regateadora) * 0.65 * (super.getEstrellas() / 10));
    }

    @Override
    public String toString() {
        return "pateador- " + "Nombre: " + super.getNombre();
    }

    
    
}
