/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author reroes
 */
public class EmpleadoNoComisionado extends Empleado{
    public String obtener_salario_final(){
        return "Mi salario es no comisionado, mi nombre es "+this.getNombre();
    }
}
