/*
 * @author israa
 */

package com.mycompany.practicapc2.Problema1;

public class Nodo {
    private Persona dato;
    private Nodo next;

    public Nodo(Persona dato) {
        this.dato = dato;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
}
