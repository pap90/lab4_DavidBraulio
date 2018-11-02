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

    public void siumla() {
        int marc = 0, marc2 = 0;
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ")" + equipos.get(i));
        }
        System.out.println("ingrese el numero del equipo que va a usar el jugador 1");
        int jug1 = sc.nextInt();
        ArrayList<equipo> tem = new ArrayList();
        tem.add(equipos.get(jug1));
        equipos.remove(jug1);
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ") " + equipos.get(i));

        }
        System.out.println("ingrese el numero del equipo que va a usar el jugador 2");
        int jug2 = sc.nextInt();
        equipos.add(jug1, tem.get(0));
        boolean seguir = true;
        while (seguir == true) {

            if (marc == 5) {
                seguir = false;
                System.out.println("el equipo: " + equipos.get(jug1).getNombre() + " ha ganado");
            }
            if (marc2 == 5) {
                seguir = false;
                System.out.println("el equipo: " + equipos.get(jug2).getNombre() + " ha ganado");

            }
        }
    }

    public void eliminar() {

        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ")" + equipos.get(i) + "\n");
        }
        System.out.println("ingrese la posicion del equipo del cual quiere eliminar un jugador");
        int elimi = sc.nextInt();
        for (int i = 0; i < equipos.get(elimi).getJugadores().size(); i++) {
            System.out.println(i + ")" + equipos.get(elimi).getJugadores().get(i));
        }
        System.out.println("ingrese el numero del jugador que quiere eliminar");
        int posjug = sc.nextInt();
        equipos.get(elimi).getJugadores().remove(posjug);
        System.out.println("jugador eliminado");

    }

    public void modifi() {
        System.out.println("modificar jugadores");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(i + ")" + equipos.get(i));
        }
        System.out.println("ingrese el numero del equipo del que quiere modificar un jugador");
        int pos = sc.nextInt();
        for (int i = 0; i < equipos.get(pos).getJugadores().size(); i++) {
            System.out.println(i + ")" + equipos.get(pos).getJugadores().toString());
        }
        System.out.println("ingrese la posicion del jugador que desea modificar");
        int posjug = sc.nextInt();
        System.out.println("que desea agrega"
                + "\n1)nombre"
                + "\n2))apodo"
                + "\n3)numero"
                + "\n4)equipo favorito de futbol"
                + "\n5)equipo favorito de basketball"
                + "\n6) jugador favortio"
                + "\n7)si es mayor o no"
                + "\n8)año de nacimiento"
                + "\n9)estrellas"
                + "\n10) modificaciones espaciales del jugador");
        int modicar = sc.nextInt();
        switch (modicar) {
            case 1:
                System.out.println("ingrese el nuevo nombre");
                String nnombre = sc.next();
                equipos.get(pos).getJugadores().get(posjug).setNombre(nnombre);
                break;
            case 2:
                System.out.println("ingrese el nuevo apodo");
                String napo = sc.next();
                equipos.get(pos).getJugadores().get(posjug).setApodo(napo);
                break;
            case 3:
                System.out.println("ingrese el nuevo numero");
                String num = sc.next();
                equipos.get(pos).getJugadores().get(posjug).setNumero(num);
                break;
            case 4:
                System.out.println("ingrese el nuevo equipo de futbol");
                String equi = sc.next();
                equipos.get(pos).getJugadores().get(posjug).setEquiFavfut(equi);
                break;
            case 5:
                System.out.println("ingrese el nuevo equipo de basketball");
                String Nbas = sc.next();
                equipos.get(pos).getJugadores().get(posjug).setEquiFavBas(Nbas);
                break;
            case 6:
                System.out.println("ingrese el nuevo jugador favorito");
                String jugfa = sc.next();
                equipos.get(pos).getJugadores().get(posjug).setJugfav(jugfa);
                break;
            case 7:
                System.out.println("ingrese si es mayor o no");
                String mayor = sc.next();
                equipos.get(pos).getJugadores().get(posjug).setMayor(mayor);
                break;
            case 8:
                System.out.println("ingrese el anio de nacimiento");
                String naci = sc.next();
                equipos.get(pos).getJugadores().get(posjug).setAnio(naci);
                break;
            case 9:
                System.out.println("ingrese las estrellas del jugador");
                double est = sc.nextInt();
                equipos.get(pos).getJugadores().get(posjug).setEstrellas(est);
                break;
            case 10:

                if (equipos.get(pos).getJugadores().get(posjug) instanceof Tirador) {
                    System.out.println("modificaciones especificas:");
                    System.out.println("que desea modificar \n1)tiro de 3\n2)tiro de 2\n3)manejo");
                    int subme = sc.nextInt();
                    switch (subme) {
                        case 1:
                            System.out.println("ingrese el nuevo tiro de 3");
                            double t3 = sc.nextDouble();
                            ((Tirador) equipos.get(pos).getJugadores().get(posjug)).setTiro3(t3);
                            break;
                        case 2:
                            System.out.println("ingrese el nuevo tiro de 2");
                            double t2 = sc.nextDouble();
                            ((Tirador) equipos.get(pos).getJugadores().get(posjug)).setTiro2(t2);
                            break;
                        case 3:
                            System.out.println("ingrese el nuevo manejo");
                            double manejo = sc.nextDouble();
                            ((Tirador) equipos.get(pos).getJugadores().get(posjug)).setManejo(manejo);

                            break;
                        default:
                            System.out.println("ingreso un dato invalido");
                            break;

                    }
                } else if (equipos.get(pos).getJugadores().get(posjug) instanceof pateador) {

                    System.out.println("modificaciones especificas:");
                    System.out.println("que desea modificar \n1)patada\n2)fuerza\n3)regate");
                    int subme = sc.nextInt();
                    switch (subme) {
                        case 1:
                            System.out.println("ingrese la nueva patada");
                            double pat = sc.nextDouble();
                            ((pateador) equipos.get(pos).getJugadores().get(posjug)).setPatada(pat);
                            break;
                        case 2:
                            System.out.println("ingrese la nueva fuerza");
                            double fue = sc.nextDouble();
                            ((pateador) equipos.get(pos).getJugadores().get(posjug)).setFuerza(fue);
                            break;
                        case 3:
                            System.out.println("ingrese el nuevo regate");
                            double rega = sc.nextDouble();
                            ((pateador) equipos.get(pos).getJugadores().get(posjug)).setRegateadora(rega);

                            break;
                        default:
                            System.out.println("ingreso un dato invalido");
                            break;

                    }
                }
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }
}
