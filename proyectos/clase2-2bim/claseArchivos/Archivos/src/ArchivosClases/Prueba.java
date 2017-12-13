// Fig. 14.5: PruebaDemostracionFile.java
// Prueba de la clase DemostracionFile.
import java.util.Scanner;
import java.io.File;
import java.net.URI;

public class Prueba
{
   public static void main( String args[] )
   {
      try
      {
         File testFile = new File( "C:\\books\\2004\\sjhtp7e\\frame\\jhtp7_14_Files.fm" );
         System.out.println( testFile.toURI().toString() );
      }
      catch ( Exception exception )
      {
         System.out.println( "exception" );
      }
   } // end main
} // end class Prueba

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