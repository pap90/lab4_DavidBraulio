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
    public void siumla(){
        int marc=0,marc2=0;
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i+")"+equipos.get(i));
        }
        System.out.println("ingrese el numero del equipo que va a usar el jugador 1");
        int jug1=sc.nextInt();
        ArrayList<equipo>tem= new ArrayList();
        tem.add(equipos.get(jug1));
        equipos.remove(jug1);
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i+") "+equipos.get(i));
            
        }
        System.out.println("ingrese el numero del equipo que va a usar el jugador 2");
        int jug2=sc.nextInt();
        equipos.add(jug1,tem.get(0));
        boolean seguir=true;
        while(seguir==true){
        
        
        
            if (marc==5) {
                seguir=false;
                System.out.println("el equipo: "+equipos.get(jug1).getNombre()+" ha ganado");                        
            }
            if (marc2==5) {
                seguir=false;
                System.out.println("el equipo: "+equipos.get(jug2).getNombre()+" ha ganado");
                
            }
        }
    }
}
