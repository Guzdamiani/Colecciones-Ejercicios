/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ejercicio03colecciones;

import Services.AlumnoServices;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio03Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServices as = new AlumnoServices();

        System.out.println("¿Cuántos alumnos desea crear?");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            as.crearAlumno();
        }

        System.out.println("Ingrese el nombre del alumno cuyo promedio desea conocer:");
        String nombre = leer.next();
        
        double promedioFinal = as.notaFinal(nombre);
        
        if (promedioFinal == 0.0) {
            
            System.out.println("El alumno " + nombre + " no se encuentra en la lista.");
        } else {
            System.out.println("La nota final de " + nombre + " es " + promedioFinal);
        }

    }

}
