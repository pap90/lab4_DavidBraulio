/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Scanner;
import static lab4.pateador.sc;

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
        ArrayList<jugadores> jugadores = new ArrayList();
        ArrayList<equipo> equipos = new ArrayList();
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
                                System.out.println(equipos.get(i) + "\n");
                            }
                            break;
                        default:
                            System.out.println("ingreso un valor invalido");
                            break;

                    }
                    break;
                case 2:
                    if (equipos.size() < 0) {

                        int resp2 = -1;
                        while (resp2 != 0) {
                            System.out.println("0- salir\n"
                                    + "1- agregar jugador\n"
                                    + "2- eliminar jugador\n"
                                    + "3-modificar jugador\n");
                            resp2 = sc.nextInt();
                            switch (resp2) {
                                case 1:
                                    for (int i = 0; i < equipos.size(); i++) {
                                        System.out.println("equipo " + i + " " + equipos.get(i));
                                    }
                                    System.out.println("ingrese que equipo desea: ");
                                    String selecciondeequipo = sc.next();
                                    int contequ = 0;
                                    for (int i = 0; i < selecciondeequipo.length(); i++) {
                                        if (Character.isLetter(selecciondeequipo.charAt(i))) {
                                            contequ++;
                                        }
                                    }
                                    while (contequ > 0 || Integer.valueOf(selecciondeequipo) > equipos.size()) {
                                        System.out.println("valor invalido ingrese otro.");
                                        selecciondeequipo = sc.next();
                                        contequ = 0;
                                        for (int i = 0; i < selecciondeequipo.length(); i++) {
                                            if (Character.isLetter(selecciondeequipo.charAt(i))) {
                                                contequ++;
                                            }
                                        }
                                    }
                                    int seleccionfinal=Integer.valueOf(selecciondeequipo);
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
                                    int estrellasfinal = Integer.valueOf(estrellas);

                                    switch (respj) {
                                        case 1:
                                            System.out.println("Ingrese tiro 2: ");
                                            String tiro2 = sc.next();
                                            for (int i = 0; i < tiro2.length(); i++) {
                                                if (Character.isLetter(tiro2.charAt(i))) {
                                                    conte++;
                                                }
                                            }
                                            while (conte > 0 || Integer.valueOf(tiro2) > 100) {
                                                System.out.println("valor invalido ingrese otro.");
                                                tiro2 = sc.next();
                                                conte = 0;
                                                for (int i = 0; i < tiro2.length(); i++) {
                                                    if (Character.isLetter(tiro2.charAt(i))) {
                                                        conte++;
                                                    }
                                                }
                                            }
                                            double tiro2final = Integer.valueOf(tiro2);
                                            System.out.println("Ingrese tiro 3: ");
                                            String tiro3 = sc.next();
                                            for (int i = 0; i < tiro3.length(); i++) {
                                                if (Character.isLetter(tiro3.charAt(i))) {
                                                    conte++;
                                                }
                                            }
                                            while (conte > 0 || Integer.valueOf(tiro3) > 100) {
                                                System.out.println("valor invalido ingrese otro.");
                                                tiro3 = sc.next();
                                                conte = 0;
                                                for (int i = 0; i < tiro3.length(); i++) {
                                                    if (Character.isLetter(tiro3.charAt(i))) {
                                                        conte++;
                                                    }
                                                }
                                            }
                                            double tiro3final = Integer.valueOf(tiro3);
                                            System.out.println("ingrese manejo 1-100: ");
                                            String manejo = sc.next();
                                            for (int i = 0; i < manejo.length(); i++) {
                                                if (Character.isLetter(manejo.charAt(i))) {
                                                    conte++;
                                                }
                                            }
                                            while (conte > 0 || Integer.valueOf(manejo) > 100) {
                                                System.out.println("valor invalido ingrese otro.");
                                                manejo = sc.next();
                                                conte = 0;
                                                for (int i = 0; i < manejo.length(); i++) {
                                                    if (Character.isLetter(manejo.charAt(i))) {
                                                        conte++;
                                                    }
                                                }
                                            }
                                            double manejofinal = Integer.valueOf(manejo);

                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                default:
                            }
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
