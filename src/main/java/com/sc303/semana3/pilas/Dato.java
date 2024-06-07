/*
 * @author Isra.Arguedas
 * Known as Stack o LIFO (Last in First out)
 * Caracteristicas: 
    * Solo se pueden colocar elementos en la parte superior (push/apilar) - comportamientos
    * Solo se pueden eliminar elementos en la parte superior (pop/desapilar) - comportamientos
    * Solo tenemos acceso a los elementos en la parte superior (top/cima) - atributo
 */

package com.sc303.semana3.pilas;

public class Dato {
    private String nombre;

    public Dato() {
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
