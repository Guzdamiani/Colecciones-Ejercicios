/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04extracolecciones.services;

import ejercicio04extracolecciones.entities.Ciudad;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class CiudadServices {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, String> mapaCiudades = new HashMap();

    public void crearCiudades() {

        System.out.println("");
        System.out.println("A continuación deberá ingresar 10 ciudades y sus codigos postales correspondientes:");

        for (int i = 0; i < 10; i++) {
            
            Ciudad c = new Ciudad();

            System.out.println("");
            System.out.println("Ingrese el nombre de la ciudad " + (i+1));
            c.setCiudad(leer.next());
            System.out.println("Ingrese su código postal:");
            c.setCodigoPostal(leer.next());
            
            mapaCiudades.put(c.getCodigoPostal(), c.getCiudad());
            
            System.out.println("");
            System.out.println("Ciudad ingresada con éxito.");
        }
    }
    
    
    public void mostrarCiudades() {
        
        System.out.println("Ciudades::");
        System.out.println("");
        
        for (Map.Entry<String, String> entry : mapaCiudades.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("Código postal: "+key+", Ciudad: "+value);
            
        }
    }
    
    public void buscarPorCodigoPostal() {
        
        System.out.println("");
        System.out.println("Ingrese el códgio postal de la ciudad que desea buscar:");
        System.out.println("");
        String codigo = leer.next();
        String ciudad = "";
        boolean existe = false;
        
        for (Map.Entry<String, String> entry : mapaCiudades.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            
            if (key.equals(codigo)) {
                existe = true;
                ciudad = value;
                break;
            }
        }
        
        if (existe) {
            System.out.println("");
            System.out.println("La ciudad correspondiente al código "+codigo+" es "+ciudad);
        } else {
            System.out.println("");
            System.out.println("No hay ninguna ciudad en la lista con el código postal ingresado.");
        }
    }
    
    public void agregarCiudad() {
        
        Ciudad c = new Ciudad();

            System.out.println("");
            System.out.println("Ingrese el nombre de la ciudad que desea agregar:");
            c.setCiudad(leer.next());
            System.out.println("Ingrese su código postal:");
            c.setCodigoPostal(leer.next());
            
            mapaCiudades.put(c.getCodigoPostal(), c.getCiudad());
            
            System.out.println("");
            System.out.println("Ciudad ingresada con éxito.");
            
    }
    
    public void eliminarCiudades() {
        
        System.out.println("");
        System.out.println("Ingrese el nombre de 3 ciudades que desee eliminar:");
        System.out.println("");
        
        String ciud1 = leer.next();
        String ciud2 = leer.next();
        String ciud3 = leer.next();
        
        Iterator<Map.Entry<String, String>> it = mapaCiudades.entrySet().iterator();
        
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();

            // Si la clave o el valor cumple con una condición específica, eliminar el elemento
            if (entry.getValue().equalsIgnoreCase(ciud1) || entry.getValue().equalsIgnoreCase(ciud2) || entry.getValue().equalsIgnoreCase(ciud3)) {
                it.remove();
            }
        }
    }
    
}
