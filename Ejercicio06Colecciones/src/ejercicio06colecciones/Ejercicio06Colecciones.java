/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package ejercicio06colecciones;

import ejercicio06colecciones.services.ProductoServices;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio06Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServices ps = new ProductoServices();

        int opcion;

        do {

            System.out.println("TiendApp:");
            System.out.println("");
            System.out.println("Menu principal");
            System.out.println("");
            System.out.println("1. Ingresar producto.");
            System.out.println("2. Modificar precio.");
            System.out.println("3. Eliminar producto.");
            System.out.println("4. Mostrar todos los productos.");
            System.out.println("5. Salir");
            System.out.println("");
            
            do {
                System.out.println("Ingrese el número de la opción deseada:");
                opcion = leer.nextInt();

                if (opcion < 1 || opcion > 5) {
                    System.out.println("Opción inválida, intente nuevamente.");
                }

            } while (opcion < 1 || opcion > 5);

            switch (opcion) {
                case 1:
                    ps.crearProducto();
                    break;
                case 2:
                    ps.modificarPrecio();
                    break;
                case 3:
                    ps.eliminarProducto();
                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
            }

        } while (opcion != 5);

        System.out.println("");
        System.out.println("Has salido con éxito.");
    }

}
