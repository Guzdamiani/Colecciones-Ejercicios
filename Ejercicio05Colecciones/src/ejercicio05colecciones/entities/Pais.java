/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05colecciones.entities;

import java.util.Objects;

/**
 *
 * @author guzma
 */
public class Pais implements Comparable<Pais> {

    private String nombre;
    private String continente;

    public Pais(String nombre, String continente) {
        this.nombre = nombre;
        this.continente = continente;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.continente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.continente, other.continente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", continente=" + continente + '}';
    }

    @Override
    public int compareTo(Pais p) {
        return this.nombre.compareTo(p.getNombre());
    }

}
