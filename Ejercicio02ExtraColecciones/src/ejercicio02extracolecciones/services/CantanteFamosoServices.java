/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02extracolecciones.services;

import ejercicio02extracolecciones.entities.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class CantanteFamosoServices {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CantanteFamoso crearCantante(ArrayList<CantanteFamoso> listaCantantes) {
        
        CantanteFamoso c1 = new CantanteFamoso();

        System.out.println("");
        System.out.println("Ingrese el nombre del cantante famoso");
        c1.setNombre(leer.nextLine());
        System.out.println("");

        System.out.println("Ingrese su disco más vendido:");
        c1.setDiscoConMasVentas(leer.nextLine());
        
        listaCantantes.add(c1);
        
        return c1 ;
    }
    
    public void eliminarCantante(ArrayList<CantanteFamoso> listaCantantes){
        
        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        
        System.out.println("Ingrese el nombre del cantante que desea eliminar:");
        String nombre = leer.nextLine();
        boolean eliminado = false;
        
        while (it.hasNext()) {

            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                eliminado = true;
            }
        }
        
        if (eliminado) {
            System.out.println("Se ha eliminado el cantante con éxito.");
        } else {
            System.out.println("El nombre ingresado es inválido. No se ha podido eliminar.");
        }
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> listaCantantes) {
        
        for (CantanteFamoso cantante : listaCantantes) {
            System.out.println(cantante.toString());
            System.out.println("");
        }
    }
    
    
}
