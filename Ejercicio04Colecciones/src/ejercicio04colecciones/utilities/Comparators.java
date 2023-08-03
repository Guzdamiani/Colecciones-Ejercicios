/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04colecciones.utilities;

import ejercicio04colecciones.entities.Pelicula;
import java.util.Comparator;

/**
 *
 * @author guzma
 */
public class Comparators {

    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarAlfTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarAlfDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
}
