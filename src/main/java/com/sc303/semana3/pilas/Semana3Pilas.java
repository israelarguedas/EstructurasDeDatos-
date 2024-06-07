/*
 * @author Isra.Arguedas
 * Known as Stack o LIFO (Last in First out)
 * Caracteristicas: 
    * Solo se pueden colocar elementos en la parte superior (push/apilar) - comportamientos
    * Solo se pueden eliminar elementos en la parte superior (pop/desapilar) - comportamientos
    * Solo tenemos acceso a los elementos en la parte superior (top/cima) - atributo
 */

package com.sc303.semana3.pilas;

public class Semana3Pilas {

    public static void main(String[] args) {
        Pila p = new Pila();
        
        System.out.println("Apilando 3");
        p.apilar();
        p.apilar();
        p.apilar();
        System.out.println(p);//p.mostrar();
        p.toString();
        
        System.out.println("Desapilo 1");
        p.desapilar();
        System.out.println(p);//p.mostrar();
        
        System.out.println("Desapilo 1 +");
        p.desapilar();
        System.out.println(p);//p.mostrar();
        
        System.out.println("Apilo 1 +");
        p.apilar();
        System.out.println(p);//p.mostrar();
    }
}
