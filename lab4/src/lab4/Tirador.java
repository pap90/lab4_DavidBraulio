/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tirador extends jugadores {

    private double tiro3;
    private double tiro2;
    private double manejo;
    static Scanner lea = new Scanner(System.in);

    public Tirador() {
    }

    public Tirador(double tiro3, double tiro2, double manejo, String nombre, String apodo, String numero, String equiFavfut, String equiFavBas, String jugfav, String mayor, String anio, double estrellas) {
        super(nombre, apodo, numero, equiFavfut, equiFavBas, jugfav, mayor, anio, estrellas);
        this.tiro3 = tiro3;
        this.tiro2 = tiro2;
        this.manejo = manejo;
    }

    public double getTiro3() {
        return tiro3;
    }

    public void setTiro3(double tiro3) {
        this.tiro3 = tiro3;
    }

    public double getTiro2() {
        return tiro2;
    }

    public void setTiro2(double tiro2) {
        this.tiro2 = tiro2;
    }

    public double getManejo() {
        return manejo;
    }

    public void setManejo(double manejo) {
        this.manejo = manejo;
    }

    @Override
    public double atacar() {
        System.out.println("tipo de tiro? 1)tiro de 3\n2) tiro de dos");
        int tipo = lea.nextInt();
        if (tipo == 1) {
            return (tiro3 + manejo) * 0.90 * (super.getEstrellas() / 10);
        } else if (tipo == 2) {
            return (tiro2 + manejo) * 0.95 * (super.getEstrellas() / 10);
        } else {
            return 0;
        }

    }

}
