/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.LibretaCalificacion;
/**
 *
 * @author utpl
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        double [] notas = {10, 9, 8, 10};
        String nombreEstudiante = "Rene Elizalde";
        
        LibretaCalificacion libreta2 = new LibretaCalificacion(nombreEstudiante,
                notas);
        
        libreta2.establecerPromedio();
        //Si no escribimos la linea 19 no estariamos llamando al metodo y esta 
        //se presentaria sin un promedio ya que tomaria los valores por defecto vacio.
        libreta2.establecerPromedioCualitativo();
        
        System.out.printf("\n%s\n", libreta2);        
    }
    
}
