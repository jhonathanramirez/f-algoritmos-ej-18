/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedaBinaria;


/**
 *
 * @author reroes
 */
public class JavaApplication104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int enteroABuscar = 20; // clave de b�squeda
        int posicion; // ubicaci�n de la clave de b�squeda en el arreglo
        ArregloBinario1 arregloBusqueda = new ArregloBinario1();
        System.out.println(arregloBusqueda);
        posicion = arregloBusqueda.busquedaBinaria(enteroABuscar);
        if (posicion == -1) {
            System.out.println("El entero " + enteroABuscar
                    + " no se encontro.\n");
        } else {
            System.out.println("El entero " + enteroABuscar
                    + " se encontro en la posicion " + posicion + ".\n");
        }

    }

}
