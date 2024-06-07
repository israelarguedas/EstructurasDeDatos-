/*
 * @author Isra.Arguedas
 * Known as Stack o LIFO (Last in First out)
 * Caracteristicas: 
    * Solo se pueden colocar elementos en la parte superior (push/apilar) - comportamientos
    * Solo se pueden eliminar elementos en la parte superior (pop/desapilar) - comportamientos
    * Solo tenemos acceso a los elementos en la parte superior (top/cima) - atributo
 */

package com.sc303.semana3.pilas;

public class NodoP {
    private Dato elemento;
    private NodoP siguiente;

    public NodoP() {
        this.siguiente = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return elemento.getNombre();
    }
}
