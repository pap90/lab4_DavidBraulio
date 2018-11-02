/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author User
 */
public abstract class jugadores {
    private String nombre;
    private String apodo;
    private String numero;
    private String equiFavfut;
    private String equiFavBas;
    private String jugfav;
    private String mayor;
    private String anio;
    private double estrellas;

    public jugadores() {
    }

    public jugadores(String nombre, String apodo, String numero, String equiFavfut, String equiFavBas, String jugfav, String mayor, String anio, double estrellas) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numero = numero;
        this.equiFavfut = equiFavfut;
        this.equiFavBas = equiFavBas;
        this.jugfav = jugfav;
        this.mayor = mayor;
        this.anio = anio;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEquiFavfut() {
        return equiFavfut;
    }

    public void setEquiFavfut(String equiFavfut) {
        this.equiFavfut = equiFavfut;
    }

    public String getEquiFavBas() {
        return equiFavBas;
    }

    public void setEquiFavBas(String equiFavBas) {
        this.equiFavBas = equiFavBas;
    }

    public String getJugfav() {
        return jugfav;
    }

    public void setJugfav(String jugfav) {
        this.jugfav = jugfav;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(double estrellas) {
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return "jugadores{" + "nombre=" + nombre + ", apodo=" + apodo + ", numero=" + numero + ", equiFavfut=" + equiFavfut + ", equiFavBas=" + equiFavBas + ", jugfav=" + jugfav + ", mayor=" + mayor + ", anio=" + anio + ", estrellas=" + estrellas + '}';
    }
    public abstract double atacar();
}
