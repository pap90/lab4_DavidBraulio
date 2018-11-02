/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

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

    public void menuequipo() {
        System.out.println("ingrese que desea hacer--"
                + "\n1) crear equipo"
                + "\n2) modificar equipo"
                + "\n3) eliminar equipo"
                + "\n4) listar ");
        int trabajo = sc.nextInt();
        switch (trabajo) {
            case 1:
                System.out.println("eligio crear");
                System.out.println("ingrese el nombre del equipo");
                String nombre = sc.next();
                System.out.println("ingrese el nombre del estadio");
                String estadio = sc.next();
                System.out.println("ingrese el pais del equipo");
                String pais = sc.next();
                System.out.println("ingrese el nombre del entrenador");
                String entrena = sc.next();
                System.out.println("ingrese el nombre del dueño del equipo");
                String dueño = sc.next();
                System.out.println("ingrese el nombre de la mascota");
                String mascota = sc.next();

                break;
            case 2:
                System.out.println("eligio modificar");
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println(i + ")" + equipos.get(i).getNombre());
                }
                System.out.println("ingrese el numero del equipo que quiere modificar");
                int posi = sc.nextInt();
                System.out.println("que desea modificar?\n1)nombre"
                        + "\n2)estadio"
                        + "\n3)pais"
                        + "\n4)entrenador"
                        + "\n5)dueño"
                        + "\n6)mascota");
                int modi = sc.nextInt();
                switch (modi) {
                    case 1:
                        System.out.println("modificar nombre");
                        System.out.println("ingrese el nuevo nombre del equipo");
                        String Nnombre = sc.next();
                        equipos.get(posi).setNombre(Nnombre);
                        break;
                    case 2:
                        System.out.println("modificar estadio");
                        System.out.println("ingrese el nuevo nombre del estadio");
                        String est = sc.next();
                        equipos.get(posi).setEstadio(est);
                        break;
                    case 3:
                        System.out.println("modificar pais");
                        System.out.println("ingrese el nuevo pais");
                        String Npais = sc.next();
                        equipos.get(posi).setPais(Npais);
                        break;
                    case 4:
                        System.out.println("modificar entrenador");
                        System.out.println("ingrese el nuevo nombre del entrenador");
                        String entre = sc.next();
                        equipos.get(posi).setEntrenador(entre);
                        break;
                    case 5:
                        System.out.println("modificar dueño");
                        System.out.println("ingrese el nuevo nombre del dueño");
                        String Duen = sc.next();
                        equipos.get(posi).setDueño(Duen);

                        break;
                    case 6:
                        System.out.println("modificar mascota");
                        System.out.println("ingrese el nuevo nombre de la mascota");
                        String masc = sc.next();
                        equipos.get(posi).setMascota(masc);
                        break;
                    default:
                        System.out.println("ingreso un valor invalido");
                        break;

                }
                break;
            case 3:
                System.out.println("eliminar equipo");
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println(i + ")" + equipos.get(i).getNombre());
                }
                System.out.println("ingrese el numero del equipo que desea eliminar");
                int elim = sc.nextInt();
                equipos.remove(elim);
                break;
            case 4:
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println(equipos.get(i)+"\n");
                }
                break;
            default:
                System.out.println("ingreso un valor invalido");
                break;

        }
    }
}
