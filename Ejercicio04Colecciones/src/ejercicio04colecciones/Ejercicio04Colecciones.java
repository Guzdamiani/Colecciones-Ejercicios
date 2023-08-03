/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ejercicio04colecciones;

import ejercicio04colecciones.services.PeliculaServices;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio04Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaServices ps = new PeliculaServices();
        
        System.out.println("Bienvenido al sistema de Peliculas.");
        System.out.println("");
        
        String eleccion;
        
        do {
            
            ps.crearPelicula();
            
            System.out.println("");
            System.out.println("¿Desea crear otra película? s/n ");
            eleccion = leer.next();
                    
        } while (!eleccion.equalsIgnoreCase("n"));
        
        System.out.println("Presione enter para mostrar en pantalla todas las películas:");
        String enter = leer.next();
        
        ps.mostrarTodasLasPeliculas();
        
        System.out.println("");
        System.out.println("Presione enter para mostrar en pantalla todas las películas cuya duración sea mayor a 1 hora:");
        enter = leer.next();
        
        ps.mostrarPeliculasMasDeUnaHora();
        
        System.out.println("");
        System.out.println("Presione enter para mostrar en pantalla todas las películas ordenadas de acuerdo a su duración (de mayor a menor):");
        System.out.println("");
        enter = leer.next();
        
        ps.mostrarMayorAMenorDuracion();
        
        System.out.println("");
        System.out.println("Presione enter para mostrar en pantalla todas las películas ordenadas de acuerdo a su duración (de menor a mayor):");
        System.out.println("");
        enter = leer.next();
        
        ps.mostrarMenorAMayorDuracion();
        
        System.out.println("");
        System.out.println("Presione enter para mostrar en pantalla todas las películas ordenadas por título, alfabéticamente:");
        System.out.println("");
        enter = leer.next();
        
        ps.mostrarOrdenAlfabeticoTitulo();
        
        System.out.println("");
        System.out.println("Presione enter para mostrar en pantalla todas las películas ordenadas por director, alfabéticamente:");
        System.out.println("");
        enter = leer.next();
        
        ps.mostrarOrdenAlfabeticoDirector();
        
        System.out.println("");
        System.out.println("Muchas gracias.");
    }
    
}
