/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class AlumnoServices {

    private Scanner leer;
    private ArrayList<Alumno> alumnos;

    public AlumnoServices() {

        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();
        
    }

    public Alumno crearAlumno() {

        Alumno a = new Alumno();
        ArrayList<Double> notas = new ArrayList<>();
        
        System.out.println("Ingrese el nombre del alumno a ingresar:");
        a.setNombre(leer.next());

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota nº " + (i + 1) + " del alumno:");
            notas.add(leer.nextDouble());
        }

        a.setNotas(notas);

        alumnos.add(a);

        return a;
    }

    public int verificarAlumno(String nombre) {

        Alumno alumno;

        for (int i = 0; i < alumnos.size(); i++) {

            alumno = alumnos.get(i);

            if (alumno.getNombre().equals(nombre)) {
                return i;
            }
            break;
        }

        return -1;
    }

    public double notaFinal(int posicion) {

        Alumno alumno = alumnos.get(posicion);

        ArrayList<Double> calificaciones = alumno.getNotas();

        double suma = 0;

        for (int i = 0; i < calificaciones.size(); i++) {

            suma += calificaciones.get(i);

        }

        double promedioFinal = suma / calificaciones.size();

        return promedioFinal;
    }

    public double notaFinal(String nombre) {

        double suma = 0;

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {

                for (double nota : alumnos.get(i).getNotas()) {
                    suma += nota;
                }

                return (suma / alumnos.get(i).getNotas().size());
            }
        }
        return 0.0d;
    }
}
