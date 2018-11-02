/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Random;
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
        Random r = new Random();
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
                            System.out.println("Ingrese el año de creacion");
                            String año = sc.next();
                            System.out.println("Ingrese el color: ");
                            String color = sc.next();
                            equipos.add(new equipo(nombre, estadio, pais, entrena, dueño, mascota, año, color));
                            break;
                        case 2:
                            System.out.println("eligio modificar");
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i + ")" + equipos.get(i).getNombre());
                            }
                            System.out.println("ingrese el numero del equipo que quiere modificar");
                            String preposi = sc.next();
                            int contp = 0;
                            for (int i = 0; i < preposi.length(); i++) {
                                if (Character.isLetter(preposi.charAt(i))) {
                                    contp++;
                                }
                            }
                            while (contp > 0 || Integer.valueOf(preposi) > equipos.size()) {
                                System.out.println("valor invalido ingrese otro.");
                                preposi = sc.next();
                                contp = 0;
                                for (int i = 0; i < preposi.length(); i++) {
                                    if (Character.isLetter(preposi.charAt(i))) {
                                        contp++;
                                    }
                                }
                            }
                            int posi = Integer.valueOf(preposi);
                            System.out.println("que desea modificar?\n1)nombre"
                                    + "\n2)estadio"
                                    + "\n3)pais"
                                    + "\n4)entrenador"
                                    + "\n5)dueño"
                                    + "\n6)mascota");
                            String premodi = sc.next();
                            for (int i = 0; i < premodi.length(); i++) {
                                if (Character.isLetter(premodi.charAt(i))) {
                                    contp++;
                                }
                            }
                            while (contp > 0 || Integer.valueOf(premodi) > 100) {
                                System.out.println("valor invalido ingrese otro.");
                                premodi = sc.next();
                                contp = 0;
                                for (int i = 0; i < premodi.length(); i++) {
                                    if (Character.isLetter(premodi.charAt(i))) {
                                        contp++;
                                    }
                                }
                            }
                            int modi = Integer.valueOf(premodi);
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
                            String preelim = sc.next();
                            int contel = 0;
                            for (int i = 0; i < preelim.length(); i++) {
                                if (Character.isLetter(preelim.charAt(i))) {
                                    contel++;
                                }
                            }
                            while (contel > 0 || Integer.valueOf(preelim) > 100) {
                                System.out.println("valor invalido ingrese otro.");
                                preelim = sc.next();
                                contel = 0;
                                for (int i = 0; i < preelim.length(); i++) {
                                    if (Character.isLetter(preelim.charAt(i))) {
                                        contel++;
                                    }
                                }
                            }
                            int elim = Integer.valueOf(preelim);
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
                    if (equipos.size() > 0) {

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
                                    int seleccionfinal = Integer.valueOf(selecciondeequipo);
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
                                            System.out.println("Ingrese tiro 2 1-100: ");
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
                                            System.out.println("Ingrese tiro 3 1-100: ");
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
                                            equipos.get(seleccionfinal).getJugadores().add(new Tirador(tiro3final, tiro2final, manejofinal, nombre, apodo, numero, futball, basquet, jugador, mayor, año, estrellasfinal));
                                            break;
                                        case 2:
                                            System.out.println("Ingrese patada 1-100: ");
                                            String patada = sc.next();
                                            for (int i = 0; i < patada.length(); i++) {
                                                if (Character.isLetter(patada.charAt(i))) {
                                                    conte++;
                                                }
                                            }
                                            while (conte > 0 || Integer.valueOf(patada) > 100) {
                                                System.out.println("valor invalido ingrese otro.");
                                                patada = sc.next();
                                                conte = 0;
                                                for (int i = 0; i < patada.length(); i++) {
                                                    if (Character.isLetter(patada.charAt(i))) {
                                                        conte++;
                                                    }
                                                }
                                            }
                                            int patadafinal = Integer.valueOf(patada);
                                            System.out.println("Ingrese fuerza 1-100 :");
                                            String fuerza = sc.next();
                                            for (int i = 0; i < fuerza.length(); i++) {
                                                if (Character.isLetter(fuerza.charAt(i))) {
                                                    conte++;
                                                }
                                            }
                                            while (conte > 0 || Integer.valueOf(fuerza) > 100) {
                                                System.out.println("valor invalido ingrese otro.");
                                                fuerza = sc.next();
                                                conte = 0;
                                                for (int i = 0; i < fuerza.length(); i++) {
                                                    if (Character.isLetter(fuerza.charAt(i))) {
                                                        conte++;
                                                    }
                                                }
                                            }
                                            int fuerzafinal = Integer.valueOf(fuerza);
                                            System.out.println("Ingrese regateadora 1-100");
                                            String regateadora = sc.next();
                                            for (int i = 0; i < regateadora.length(); i++) {
                                                if (Character.isLetter(regateadora.charAt(i))) {
                                                    conte++;
                                                }
                                            }
                                            while (conte > 0 || Integer.valueOf(regateadora) > 100) {
                                                System.out.println("valor invalido ingrese otro.");
                                                regateadora = sc.next();
                                                conte = 0;
                                                for (int i = 0; i < regateadora.length(); i++) {
                                                    if (Character.isLetter(regateadora.charAt(i))) {
                                                        conte++;
                                                    }
                                                }
                                            }
                                            int regateadorafinal = Integer.valueOf(regateadora);
                                            equipos.get(seleccionfinal).getJugadores().add(new pateador(patadafinal, fuerzafinal, regateadorafinal, nombre, apodo, numero, futball, basquet, jugador, mayor, año, estrellasfinal));
                                            break;
                                        default:

                                    }

                                    break;
                                case 2:
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
                                    break;
                                case 3:
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
                                    int posijug = sc.nextInt();
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
                                            equipos.get(pos).getJugadores().get(posijug).setNombre(nnombre);
                                            break;
                                        case 2:
                                            System.out.println("ingrese el nuevo apodo");
                                            String napo = sc.next();
                                            equipos.get(pos).getJugadores().get(posijug).setApodo(napo);
                                            break;
                                        case 3:
                                            System.out.println("ingrese el nuevo numero");
                                            String num = sc.next();
                                            equipos.get(pos).getJugadores().get(posijug).setNumero(num);
                                            break;
                                        case 4:
                                            System.out.println("ingrese el nuevo equipo de futbol");
                                            String equi = sc.next();
                                            equipos.get(pos).getJugadores().get(posijug).setEquiFavfut(equi);
                                            break;
                                        case 5:
                                            System.out.println("ingrese el nuevo equipo de basketball");
                                            String Nbas = sc.next();
                                            equipos.get(pos).getJugadores().get(posijug).setEquiFavBas(Nbas);
                                            break;
                                        case 6:
                                            System.out.println("ingrese el nuevo jugador favorito");
                                            String jugfa = sc.next();
                                            equipos.get(pos).getJugadores().get(posijug).setJugfav(jugfa);
                                            break;
                                        case 7:
                                            System.out.println("ingrese si es mayor o no");
                                            String mayore = sc.next();
                                            equipos.get(pos).getJugadores().get(posijug).setMayor(mayore);
                                            break;
                                        case 8:
                                            System.out.println("ingrese el anio de nacimiento");
                                            String naci = sc.next();
                                            equipos.get(pos).getJugadores().get(posijug).setAnio(naci);
                                            break;
                                        case 9:
                                            System.out.println("ingrese las estrellas del jugador");
                                            double est = sc.nextInt();
                                            equipos.get(pos).getJugadores().get(posijug).setEstrellas(est);
                                            break;
                                        case 10:

                                            if (equipos.get(pos).getJugadores().get(posijug) instanceof Tirador) {
                                                System.out.println("modificaciones especificas:");
                                                System.out.println("que desea modificar \n1)tiro de 3\n2)tiro de 2\n3)manejo");
                                                int subme = sc.nextInt();
                                                switch (subme) {
                                                    case 1:
                                                        System.out.println("ingrese el nuevo tiro de 3");
                                                        double t3 = sc.nextDouble();
                                                        ((Tirador) equipos.get(pos).getJugadores().get(posijug)).setTiro3(t3);
                                                        break;
                                                    case 2:
                                                        System.out.println("ingrese el nuevo tiro de 2");
                                                        double t2 = sc.nextDouble();
                                                        ((Tirador) equipos.get(pos).getJugadores().get(posijug)).setTiro2(t2);
                                                        break;
                                                    case 3:
                                                        System.out.println("ingrese el nuevo manejo");
                                                        double manejo = sc.nextDouble();
                                                        ((Tirador) equipos.get(pos).getJugadores().get(posijug)).setManejo(manejo);

                                                        break;
                                                    default:
                                                        System.out.println("ingreso un dato invalido");
                                                        break;

                                                }
                                            } else if (equipos.get(pos).getJugadores().get(posijug) instanceof pateador) {

                                                System.out.println("modificaciones especificas:");
                                                System.out.println("que desea modificar \n1)patada\n2)fuerza\n3)regate");
                                                int subme = sc.nextInt();
                                                switch (subme) {
                                                    case 1:
                                                        System.out.println("ingrese la nueva patada");
                                                        double pat = sc.nextDouble();
                                                        ((pateador) equipos.get(pos).getJugadores().get(posijug)).setPatada(pat);
                                                        break;
                                                    case 2:
                                                        System.out.println("ingrese la nueva fuerza");
                                                        double fue = sc.nextDouble();
                                                        ((pateador) equipos.get(pos).getJugadores().get(posijug)).setFuerza(fue);
                                                        break;
                                                    case 3:
                                                        System.out.println("ingrese el nuevo regate");
                                                        double rega = sc.nextDouble();
                                                        ((pateador) equipos.get(pos).getJugadores().get(posijug)).setRegateadora(rega);

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

                                    break;
                                default:
                            }
                        }
                    }
                    break;
                case 3:
                    int marc = 0,
                     marc2 = 0;
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
                        int pases1 = 0;
                        System.out.println("seleccione el jugador que desea que tenga la pelota: ");
                        for (int i = 0; i < equipos.get(jug1).getJugadores().size(); i++) {
                            System.out.println("jugador " + i + " " + equipos.get(jug1).getJugadores().get(i));
                        }
                        int neps = sc.nextInt();
                        while (pases1 < 4) {
                            ArrayList<jugadores> jt = new ArrayList();
                            System.out.println("El jugador que tiene la pelota es: ");
                            System.out.println(equipos.get(jug1).getJugadores().get(neps));
                            System.out.println("1- pasar\n"
                                    + "2- tirar");
                            int opcion = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("a quien desea pasarla");
                                    jt.add(equipos.get(jug1).getJugadores().get(neps));
                                    equipos.get(jug1).getJugadores().remove(neps);
                                    for (int i = 0; i < equipos.get(jug1).getJugadores().size(); i++) {
                                        System.out.println("jugador " + i + " " + equipos.get(jug1).getJugadores().get(i));
                                    }
                                    neps = sc.nextInt();
                                    equipos.get(jug1).getJugadores().add(jt.get(0));
                                    jt.remove(0);
                                    pases1++;
                                    break;
                                case 2:
                                    double tiro = equipos.get(jug1).getJugadores().get(neps).atacar();
                                    double ran = (double) 1 + r.nextInt(99);
                                    if (ran <= tiro) {
                                        marc++;
                                    }
                                    pases1 = 5;
                                    break;
                                default:

                            }
                        }

                        int pases2 = 0;
                        System.out.println("seleccione el jugador que desea que tenga la pelota: ");
                        for (int i = 0; i < equipos.get(jug2).getJugadores().size(); i++) {
                            System.out.println("jugador " + i + " " + equipos.get(jug2).getJugadores().get(i));
                        }
                        int neps2 = sc.nextInt();
                        while (pases1 < 4) {
                            ArrayList<jugadores> jt = new ArrayList();
                            System.out.println("El jugador que tiene la pelota es: ");
                            System.out.println(equipos.get(jug2).getJugadores().get(neps2));
                            System.out.println("1- pasar\n"
                                    + "2- tirar");
                            int opcion = sc.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("a quien desea pasarla");
                                    jt.add(equipos.get(jug2).getJugadores().get(neps2));
                                    equipos.get(jug2).getJugadores().remove(neps2);
                                    for (int i = 0; i < equipos.get(jug2).getJugadores().size(); i++) {
                                        System.out.println("jugador " + i + " " + equipos.get(jug2).getJugadores().get(i));
                                    }
                                    neps2 = sc.nextInt();
                                    equipos.get(jug2).getJugadores().add(jt.get(0));
                                    jt.remove(0);
                                    pases1++;
                                    break;
                                case 2:
                                    double tiro = equipos.get(jug2).getJugadores().get(neps2).atacar();
                                    double ran = (double) 1 + r.nextInt(99);
                                    if (ran <= tiro) {
                                        marc2++;
                                    }
                                    pases1 = 5;
                                    break;
                                default:

                            }
                        }

                        if (marc == 5) {
                            seguir = false;
                            System.out.println("el equipo: " + equipos.get(jug1).getNombre() + " ha ganado");
                        }
                        if (marc2 == 5) {
                            seguir = false;
                            System.out.println("el equipo: " + equipos.get(jug2).getNombre() + " ha ganado");

                        }
                    }
                    break;
                default:
            }
        }
    }

}
