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
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList jugadores = new ArrayList();
        ArrayList equipos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int resp = -1;
        while (resp != 0) {
            System.out.println("0-salir\n"
                    + "1- administrar equipos equipos\n"
                    + "2- administrar juagdores\n"
                    + "3- jugar");
            resp = sc.nextInt();
            switch (resp) {
                case 1:

                    break;
                case 2:
                    int resp2 = -1;
                    while (resp2 != 0) {
                        System.out.println("0- salir\n"
                                + "1- agregar jugador\n"
                                + "2- eliminar jugador\n"
                                + "3-modificar jugador\n");
                        resp2 = sc.nextInt();
                        switch (resp2) {
                            case 1:
                                if (true) {

                                    System.out.println("1- tirador");
                                    System.out.println("2- pateador");
                                    String respjj = sc.next();
                                    int contjj = 0;
                                    for (int i = 0; i < respjj.length(); i++) {
                                        if (Character.isLetter(respjj.charAt(i))) {
                                            contjj++;
                                        }
                                    }
                                    while (contjj > 0) {
                                        System.out.println("esa seleccion no es valida seleccione otra.");
                                        respjj = sc.next();
                                        contjj = 0;
                                        for (int i = 0; i < respjj.length(); i++) {
                                            if (Character.isLetter(respjj.charAt(i))) {
                                                contjj++;
                                            }
                                        }
                                    }
                                    int respj = Integer.valueOf(respjj);
                                    System.out.println("Ingrese el nombre: ");
                                    String nombre = sc.next();
                                    System.out.println("ingrese el apodo: ");
                                    String apodo = sc.next();
                                    System.out.println("Ingrese el numero: ");
                                    String numero = sc.next();
                                    System.out.println("ingrese el equipo favorito de futball: ");
                                    String futball = sc.next();
                                    System.out.println("ingrese el equipo favorito de basquet: ");
                                    String basquet = sc.next();
                                    System.out.println("Ingrese el jugador favorito: ");
                                    String jugador = sc.next();
                                    System.out.println("Ingrese si si es mayor ingrese no si no: ");
                                    String mayor = sc.next();
                                    System.out.println("Ingrese el año de nacimiento: ");
                                    String año = sc.next();
                                    System.out.println("Ingrese la cantidad de estrellas 1-5");
                                    String estrellas = sc.next();
                                    int conte = 0;
                                    for (int i = 0; i < estrellas.length(); i++) {
                                        if (Character.isLetter(estrellas.charAt(i))) {
                                            conte++;
                                        }
                                    }
                                    while (conte > 0 || Integer.valueOf(estrellas) > 5) {
                                        System.out.println("valor invalido ingrese otro.");
                                        estrellas = sc.next();
                                        conte = 0;
                                        for (int i = 0; i < estrellas.length(); i++) {
                                            if (Character.isLetter(estrellas.charAt(i))) {
                                                conte++;
                                            }
                                        }
                                    }
                                    int estrellasfinal=Integer.valueOf(estrellas);

                                    switch (respj) {
                                        case 1:

                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    System.out.println("no hay equipos lo siento, cree uno :v");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                        }
                    }

                    break;
                case 3:
                    break;
                default:
            }
        }
    }

}
