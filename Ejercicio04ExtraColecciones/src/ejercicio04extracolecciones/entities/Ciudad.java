/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04extracolecciones.entities;

/**
 *
 * @author guzma
 */
public class Ciudad {
    
    private String ciudad;
    private String codigoPostal;

    public Ciudad() {
    }

    public Ciudad(String ciudad, String codigoPostal) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Ciudad:" + ciudad + ", Codigo Postal:" + codigoPostal ;
    }
    
    
}
