/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo3;

/**
 *
 * @author reroes
 */
public class Ejecuto3 {
    public static void main(String[] args) {
        PersonaEquipo entrenador = new Entrenador2(1, "entrenador 1", "apellido Entrenador", 10);
        int edad1 = 20;       
        PersonaEquipo futbolista = new Futbolista2(2, "futbolista 2", "apellido futbolista2", edad1);
        PersonaEquipo presidente = new PresidenteEquipo(3, "presidente", "apellido presidente", 
                                                            40);
        PersonaEquipo relacionador_publico = new RelacionadorPublico(4, "relacionador publico",
                                                "apellido rp", edad1);
        
        entrenador.entrenamiento();
        futbolista.entrenamiento();
        presidente.entrenamiento();
        relacionador_publico.entrenamiento();
        
    }
}
