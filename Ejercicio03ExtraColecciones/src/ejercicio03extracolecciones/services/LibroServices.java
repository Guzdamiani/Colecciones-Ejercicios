/*
 Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, el método incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.

Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, el método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
 */
package ejercicio03extracolecciones.services;

import ejercicio03extracolecciones.entities.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class LibroServices {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibro(HashSet<Libro> setLibros) {

        String eleccion;

        do {

            Libro l = new Libro();

            System.out.println("A continuación deberá ingresar un libro.");

            System.out.println("");
            System.out.println("Título del líbro: ");
            l.setTitulo(leer.next());

            System.out.println("");
            System.out.println("Autor: ");
            l.setAutor(leer.next());

            System.out.println("");
            System.out.println("Ejemplares disponibles: ");
            l.setEjemplares(leer.nextInt());

            System.out.println("");
            System.out.println("Ejemplares prestados: ");
            l.setEjemplaresPrestados(leer.nextInt());

            setLibros.add(l);

            System.out.println("Libro creado con éxito.");
            System.out.println("");
            System.out.println("¿Desea agregar otro libro? s/n");
            eleccion = leer.next();

        } while (!eleccion.equalsIgnoreCase("n"));

    }

    public boolean prestamo(HashSet<Libro> setLibros) {

        System.out.println("");
        System.out.println("Ingrese el nombre del libro que desea tomar prestado:");
        String nombre = leer.next();
        boolean prestado = false;

        for (Libro libroBuscado : setLibros) {

            if (nombre.equalsIgnoreCase(libroBuscado.getTitulo())) {

                if (libroBuscado.getEjemplares() > 0) {

                    libroBuscado.setEjemplares(libroBuscado.getEjemplares() - 1);
                    libroBuscado.setEjemplaresPrestados(libroBuscado.getEjemplaresPrestados() + 1);
                    prestado = true;
                    break;
                } else {
                    System.out.println("");
                    System.out.println("El libro ingresado no tiene ejemplares disponibles para prestamo.");
                }
            }
        }

        return prestado;

    }

    public boolean devolucion(HashSet<Libro> setLibros) {

        System.out.println("");
        System.out.println("Ingrese el nombre del libro que desea devolver:");
        String nombre = leer.next();
        boolean devuelto = false;

        for (Libro libroBuscado : setLibros) {

            if (nombre.equalsIgnoreCase(libroBuscado.getTitulo())) {
                if (libroBuscado.getEjemplaresPrestados() > 0) {
                    libroBuscado.setEjemplares(libroBuscado.getEjemplares() + 1);
                    libroBuscado.setEjemplaresPrestados(libroBuscado.getEjemplaresPrestados() - 1);
                    devuelto = true;
                    break;
                } else {
                    System.out.println("");
                    System.out.println("El libro ingresado no tiene ejemplares prestados, por lo que no corresponde la devolución.");
                }
            }
        }

        return devuelto;
    }

    public void mostrarLibros(HashSet<Libro> setLibros) {

        for (Libro libro : setLibros) {
            System.out.println(libro.toString());
        }
    }
}
