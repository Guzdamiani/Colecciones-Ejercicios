/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
 */
package ejercicio03extracolecciones;

import ejercicio03extracolecciones.entities.Libro;
import ejercicio03extracolecciones.services.LibroServices;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio03ExtraColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> setLibros = new HashSet();
        LibroServices ls = new LibroServices();

        ls.crearLibro(setLibros);

        String eleccion;

        do {

            System.out.println("");
            System.out.println("Menu:");
            System.out.println("");
            System.out.println("1. Ingresar libro.");
            System.out.println("2. Tomar libro prestado.");
            System.out.println("3. Devolver libro.");
            System.out.println("4. Mostrar Libros.");
            System.out.println("5. Salir.");
            System.out.println("");
            System.out.println("Elija la opción deseada:");
            eleccion = leer.next();

            switch (eleccion) {
                case "1":
                    ls.crearLibro(setLibros);
                    break;
                case "2":
                    boolean prestado = ls.prestamo(setLibros);
                    if (prestado) {
                        System.out.println("");
                        System.out.println("El prestamo se ha realizado con éxito, que disfrutes el libro!");
                    }
                    break;
                case "3":
                    boolean devuelto = ls.devolucion(setLibros);
                    if (devuelto) {
                        System.out.println("");
                        System.out.println("Gracias por devolver el libro!");
                    }
                    break;
                case "4":
                    ls.mostrarLibros(setLibros);
                    break;
                case "5":
                    System.out.println("");
                    System.out.println("Has salido con éxito.");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción inválida, intente nuevamente.");
            }

        } while (!eleccion.equals("5"));

    }

}
