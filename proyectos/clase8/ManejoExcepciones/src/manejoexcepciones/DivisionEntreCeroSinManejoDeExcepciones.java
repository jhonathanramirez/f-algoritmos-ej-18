// Fig. 13.1: DivisionEntreCeroSinManejoDeExcepciones.java
// Una aplicaci�n que trata de realizar una divisi�n entre cero.
import java.util.Scanner;

public class DivisionEntreCeroSinManejoDeExcepciones
{
   // demuestra el lanzamiento de una excepci�n cuando ocurre una divisi�n entre cero
   public static int cociente( int numerador, int denominador )
   {
      return numerador / denominador; // posible divisi�n entre cero
   } // fin del m�todo cociente

   public static void main( String args[] )
   {
      Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada

      System.out.print( "Introduzca un numerador entero: " );
      int numerador = explorador.nextInt();
      System.out.print( "Introduzca un denominador entero: " );
      int denominador = explorador.nextInt();

      int resultado = cociente( numerador, denominador );
      System.out.printf( 
         "\nResultado: %d / %d = %d\n", numerador, denominador, resultado );
   } // fin de main
} // fin de la clase DivisionEntreCeroSinManejoDeExcepciones


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/