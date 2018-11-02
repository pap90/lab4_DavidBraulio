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
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int resp=-1;
        while (resp!=0) {
            System.out.println("0-salir\n"
                    + "1-administrar juagdores\n"
                    + "2-jugar");
            resp=sc.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("1- agregar jugador\n"
                            + "2- eli");
                    break;
                case 2:
                    break;
                default:
            }
        }
    }
    
}
