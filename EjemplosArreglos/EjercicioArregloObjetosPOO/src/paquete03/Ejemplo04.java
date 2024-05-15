/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class Ejemplo04 {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Franco", "Nombramiento");
        Profesor profesor2 = new Profesor("Richard", "Contrato");
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = new Calificacion[2];
        
        Calificacion c = new Calificacion(10, "Computacion", profesor1);
        Calificacion c2 = new Calificacion(9, "Electronica", profesor2);
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - Profesor(%s) - Tipo(%s)\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(), 
                    objetoCalificacion.obtenerProfesor().obtenerNombre(), 
                    objetoCalificacion.obtenerProfesor().obtenerTipo());
            //Para llegar a presentar profesor y tipo debemos de la clase Calificacion 
            //se llama al metodo obtener profesor ya que dentro de esta se encuentra 
            //el metodo obtener nombre y obtener tipo
        }  
    }
}
