/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ejercicio01y02colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio01y02Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        String eleccion;

        do {
            System.out.println("Ingrese una raza de perro");
            String raza = leer.next();

            razas.add(raza);

            System.out.println("");
            System.out.println("Desea agregar otra raza de perro? Ingrese s/n ");
            eleccion = (leer.next()).toLowerCase();

        } while (eleccion.equals("s"));

        for (String aux : razas) {
            System.out.println(aux);
        }

        eliminarRaza(razas);

        System.out.println("");
        
        Collections.sort(razas);

        for (String aux : razas) {
            System.out.println(aux);
        }

    }

    public static void eliminarRaza(ArrayList razas) {

        Scanner leer = new Scanner(System.in);
        Iterator<String> it = razas.iterator();

        System.out.println("Ingrese la raza que desea eliminar de la lista:");
        String raza = leer.next();

        boolean esta = false;

        while (it.hasNext()) {

            String aux = it.next();

            if (aux.equals(raza)) {
                it.remove();
                esta = true;
                break;
            }
        }

        if (esta) {
            System.out.println("La raza " + raza + " se ha eliminado con éxito.");
        } else {
            System.out.println("Intento de eliminación fallido. La raza ingresada no se encuentra en la lista.");
        }

    }
}
