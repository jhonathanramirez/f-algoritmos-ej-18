/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoseis;

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejecutor {
        public static void main(String args[]) {
        
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese su nombre");
            String nombre = scan.nextLine();
            
            System.out.println("Ingrese su apellido");
            String apellido = scan.nextLine();
            
            String [] calificaciones = {"10", "15","l"};
            Persona p = new Persona(nombre, apellido, calificaciones);
            System.out.println(p);
        }
}
