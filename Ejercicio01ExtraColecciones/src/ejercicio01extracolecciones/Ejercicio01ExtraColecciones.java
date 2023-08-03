/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio). 
 */
package ejercicio01extracolecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio01ExtraColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> listaNumeros = new ArrayList();

        int numero;
        
        do {

            System.out.println("Ingrese el número que desea agregar a la lista. Para salir ingrese -99");
            numero = leer.nextInt();

            if (!(numero == -99)) {

                listaNumeros.add(numero);

                System.out.println("Número ingresado con éxito");
                System.out.println("");

            }
        } while (!(numero == -99));

        double suma = 0;
        
        for (Integer num : listaNumeros) {
            
            suma += num;
        }
        
        System.out.println("Valores ingresados: "+listaNumeros.size());
        System.out.println("Suma: "+suma);
        System.out.println("Promedio: "+ (double)(suma/listaNumeros.size()));
        
        System.out.println("");
        System.out.println("Fin.");
        
    }

}
