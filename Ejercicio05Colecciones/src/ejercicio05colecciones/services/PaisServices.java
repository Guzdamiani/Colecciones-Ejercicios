/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05colecciones.services;

import ejercicio05colecciones.entities.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class PaisServices {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet<Pais> setPaises = new HashSet();

    public Pais crearPais() {

        Pais p = new Pais();

        System.out.println("Ingrese el nombre del país:");
        p.setNombre(leer.next());

        System.out.println("Ingrese el continente en que se encuentra dicho país:");
        p.setContinente(leer.next());

        setPaises.add(p);

        return p;
    }

    public void mostrarPaises() {

        for (Pais pais : setPaises) {
            System.out.println(pais);
        }
    }

    public void mostrarPaisesOrdenAlf() {

        ArrayList<Pais> listaPaises = new ArrayList(setPaises);

        Collections.sort(listaPaises);

        for (Pais pais : listaPaises) {
            System.out.println(pais);
        }

    }

    public boolean eliminarPaisPorNombre(String nombre) {

        Iterator<Pais> it = setPaises.iterator();
        boolean eliminado = false;

        while (it.hasNext()) {

            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                eliminado = true;
            }
        }
        
        return eliminado;
    }
}
