/*
 Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.

• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos

 */
package ejercicio04extracolecciones;

import ejercicio04extracolecciones.services.CiudadServices;

/**
 *
 * @author guzma
 */
public class Ejercicio04ExtraColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CiudadServices ps = new CiudadServices();
        
        ps.crearCiudades();
        
        ps.mostrarCiudades();
        
        ps.buscarPorCodigoPostal();
        
        ps.mostrarCiudades();
        
        ps.agregarCiudad();
        
        ps.eliminarCiudades();
        
        ps.mostrarCiudades();
        
    }
    
}
