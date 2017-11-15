/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo2;

/**
 *
 * @author reroes
 */
public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    
    public Empleado(String n, String a, String c){
        nombre = n;
        apellido = a;
        cedula = c;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String toString(){
        return  String.format("%s %s\n cédula: %s", this.getNombre(), this.getApellido(), this.getCedula());
    }
    
    public abstract double ingresos();
}
