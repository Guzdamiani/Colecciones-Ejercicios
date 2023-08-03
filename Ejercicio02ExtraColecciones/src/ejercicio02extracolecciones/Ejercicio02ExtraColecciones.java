/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02extracolecciones;

import ejercicio02extracolecciones.entities.CantanteFamoso;
import ejercicio02extracolecciones.services.CantanteFamosoServices;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Ejercicio02ExtraColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CantanteFamosoServices cs = new CantanteFamosoServices();
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();

        System.out.println("A continuación deberá ingresar 5 cantantes famosos junto con su disco más vendido.");
        System.out.println("");

        for (int i = 0; i < 5; i++) {

            cs.crearCantante(listaCantantes);

        }

        int eleccion;
        do {
            System.out.println("Elija una opción:");
            System.out.println("");
            System.out.println("1. Agregar un cantante.");
            System.out.println("2. Eliminar un cantante.");
            System.out.println("3. Mostrar cantantes.");
            System.out.println("4. Salir");
            System.out.println("");

            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    cs.crearCantante(listaCantantes);
                    break;
                case 2:
                    cs.eliminarCantante(listaCantantes);
                    break;
                case 3:
                    cs.mostrarCantantes(listaCantantes);
                    break;
                case 4:
                    System.out.println("Se ha salido con éxito");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (eleccion != 4);
        
        System.out.println("");
        System.out.println("Lista final:");
        System.out.println("");
        cs.mostrarCantantes(listaCantantes);

    }

}
