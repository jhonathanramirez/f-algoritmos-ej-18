/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElPolimorfismo;

/**
 *
 * @author reroes
 */
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;
// constructor de cuatro argumentos

    public EmpleadoAsalariado(String nombre, String apellido, String nss,
            double salario) {
        super(nombre, apellido, nss); // los pasa al constructor de Empleado
        establecerSalarioSemanal(salario); // valida y almacena el salario
    } // fin del constructor de EmpleadoAsalariado con cuatro argumentos
// establece el salario

    public void establecerSalarioSemanal(double salario) {
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    } // fin del método establecerSalarioSemanal
// devuelve el salario

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    } // fin del método obtenerSalarioSemanal
// calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado

    public double ingresos() {
        return obtenerSalarioSemanal();
    } // fin del método ingresos

// devuelve representación String de un objeto EmpleadoAsalariado

    public String toString() {
        return String.format("empleado asalariado: %s\n%s: $%,.2f",
                super.toString(), "salario semanal", obtenerSalarioSemanal());
    } // fin del método toString
}
