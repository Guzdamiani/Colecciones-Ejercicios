/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06colecciones.services;

import ejercicio06colecciones.entities.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class ProductoServices {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap <String, Double> mapaProductos = new HashMap();
    
    public Producto crearProducto() {
        
        Producto p = new Producto();
        
        System.out.println("Ingrese el nombre del producto:");
        p.setNombre(leer.next());
        
        System.out.println("Ingrese el precio del producto:");
        p.setPrecio(leer.nextDouble());
        
        mapaProductos.put(p.getNombre(), p.getPrecio());
        
        System.out.println("");
        System.out.println("El producto se ha ingresado con éxito.");
        
        System.out.println("");
        System.out.println("Presione enter para volver al menu principal:");
        String enter = leer.next();
        
        return p;
    }
    
    public void modificarPrecio() {
        
        boolean seEncuentra = false;
        
        System.out.println("Ingrese el producto cuyo precio desea modificar:");
        String nombre = leer.next();
        
        System.out.println("Ingrese el nuevo precio para dicho produto:");
        double precio = leer.nextDouble();
        
        for (Map.Entry<String, Double> entry : mapaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            if (key.equalsIgnoreCase(nombre)) {
                entry.setValue(precio);
                seEncuentra = true;
                break;
            }
        }
        
        if (seEncuentra) {
            System.out.println("El precio se ha modificado con éxito ");
        } else {
            System.out.println("Error. El producto ingresado no se encuentra en la lista.");
        }
        
        System.out.println("");
        System.out.println("Presione enter para volver al menu principal:");
        String enter = leer.next();
        
    }
    
    public void eliminarProducto() {
        
        boolean seEncuentra = false;
        
        System.out.println("Ingrese el producto que desee eliminar");
        String nombre = leer.next();
        
        for (Map.Entry<String, Double> entry : mapaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            if (key.equalsIgnoreCase(nombre)) {
                mapaProductos.remove(key);
                seEncuentra = true;
                break;
            }
        }
        
        if (seEncuentra) {
            System.out.println("El producto se ha eliminado con éxito.");
        } else {
            System.out.println("Error. El producto ingresado no se encuentra en la lista.");
        }
        
        System.out.println("");
        System.out.println("Presione enter para volver al menu principal:");
        String enter = leer.next();
        
    }
    
    public void mostrarProductos() {
        
        System.out.println("Lista de productos:");
        System.out.println("");
        
        for (Map.Entry<String, Double> entry : mapaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            System.out.println("Producto: "+key+", Precio: "+value+"$");
            
        }
        
        System.out.println("");
        System.out.println("Presione enter para volver al menu principal:");
        String enter = leer.next();
    }
}
