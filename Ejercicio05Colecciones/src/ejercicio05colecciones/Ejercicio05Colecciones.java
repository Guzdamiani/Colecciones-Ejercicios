/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente).

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package ejercicio05colecciones;

import ejercicio05colecciones.services.PaisServices;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio05Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServices ps = new PaisServices();

        String eleccion;

        do {

            ps.crearPais();

            System.out.println("");

            do {
                System.out.println("¿Desea crear otro país? s/n ");
                eleccion = leer.next();
                System.out.println("");

                if (!eleccion.equalsIgnoreCase("s") && !eleccion.equalsIgnoreCase("n")) {
                    System.out.println("Opción inválida, intente nuevamente.");
                    System.out.println("");
                }

            } while (!eleccion.equalsIgnoreCase("s") && !eleccion.equalsIgnoreCase("n"));

        } while (!eleccion.equalsIgnoreCase("n"));

        System.out.println("Paises:");
        System.out.println("");

        ps.mostrarPaises();

        System.out.println("");
        System.out.println("Presione enter para mostrar el conjunto de paises en órden alfabético");

        System.out.println("");
        String enter = leer.next();

        System.out.println("Paises en orden alfabético:");
        System.out.println("");
        ps.mostrarPaisesOrdenAlf();

        System.out.println("");

        boolean eliminado;

        do {
            System.out.println("Ingrese el pais que desea eliminar:");
            String nombre = leer.next();
            
            eliminado = ps.eliminarPaisPorNombre(nombre);
            
            if (eliminado) {
                System.out.println(nombre+" se ha eliminado con éxito de la lista.");
                System.out.println("");
            } else {
                System.out.println("El nombre ingresado no se encuentra en la lista de pais. Intente nuevamente.");
                System.out.println("");
            }
            
        } while (!eliminado);
        
        System.out.println("");
        System.out.println("Paises en orden alfabético:");
        System.out.println("");
        ps.mostrarPaisesOrdenAlf();
    }

}
