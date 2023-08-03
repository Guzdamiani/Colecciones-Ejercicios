/*
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
package ejercicio04colecciones.services;

import ejercicio04colecciones.entities.Pelicula;
import ejercicio04colecciones.utilities.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class PeliculaServices {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> listaPeliculas = new ArrayList();

    public Pelicula crearPelicula() {

        Pelicula p = new Pelicula();

        System.out.println("Ingrese el título de la película:");
        p.setTitulo(leer.nextLine());

        System.out.println("Ingrese el director de la película:");
        p.setDirector(leer.nextLine());

        System.out.println("Ingrese la duración de la película (en horas):");
        p.setDuracion(leer.nextDouble());
        leer.nextLine();
        
        listaPeliculas.add(p);

        return p;
    }

    public void mostrarTodasLasPeliculas() {

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarPeliculasMasDeUnaHora() {

        for (Pelicula pelicula : listaPeliculas) {

            if (pelicula.getDuracion() > 1.0) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void mostrarMayorAMenorDuracion() {

        Collections.sort(listaPeliculas, Comparators.ordenarPorDuracionDesc);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarMenorAMayorDuracion() {

        Collections.sort(listaPeliculas, Comparators.ordenarPorDuracionAsc);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarOrdenAlfabeticoTitulo() {

        Collections.sort(listaPeliculas, Comparators.ordenarAlfTitulo);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarOrdenAlfabeticoDirector() {

        Collections.sort(listaPeliculas, Comparators.ordenarAlfDirector);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }
}
