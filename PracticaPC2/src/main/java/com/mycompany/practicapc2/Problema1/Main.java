/*
 * @author israa
 */

package com.mycompany.practicapc2.Problema1;

public class Main {
    
    public static void main(String[] args) {
       Lista laLista = new Lista();
       laLista.inserta(new Persona(10, "Juan"));
       laLista.inserta(new Persona(5, "Pedro"));
       laLista.inserta(new Persona(15, "Beto"));
       laLista.inserta(new Persona(20, "Dani"));
       laLista.inserta(new Persona(30, "Sebas"));
       
        System.out.println("El tamaño de la lista es: " + laLista.size());
        System.out.println("La lista es vacia: " + laLista.esVacia());
        System.out.println("Existe valor: " + laLista.existeValor(new Persona(6, "Juan")));
        System.out.println("Existe valor: " + laLista.existeValor(new Persona(6, "Juan")));
        System.out.println("Indice del valor: " + laLista.valorEn(6));
        System.out.println(laLista);
       
    }
}
