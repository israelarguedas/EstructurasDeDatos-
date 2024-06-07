/*
 * @author Isra.Arguedas
 * Known as Stack o LIFO (Last in First out)
 * Caracteristicas: 
    * Solo se pueden colocar elementos en la parte superior (push/apilar) - comportamientos
    * Solo se pueden eliminar elementos en la parte superior (pop/desapilar) - comportamientos
    * Solo tenemos acceso a los elementos en la parte superior (top/cima) - atributo
 */

package com.sc303.semana3.pilas;

import javax.swing.JOptionPane;

public class Pila {
    private NodoP cima;

    public Pila() {
        this.cima = null;
    }
    
    public boolean esVacia(){
        if(cima==null){
            return true;
        } else {
            return false;
        }
    }
    
    public void apilar(){
        Dato d = new Dato();
        d.setNombre(JOptionPane.showInputDialog(null, 
                "Ingrese el nombre:"));
        NodoP nuevo = new NodoP();
        nuevo.setElemento(d);
        
        if(esVacia()){
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        } 
    }
    
    public void desapilar(){
        if(!esVacia()){
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento extraido");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, pila vacia");
        }
    }
    
    @Override
    public String toString(){
        String s = "";
        if(!esVacia()){
            NodoP aux = cima;
            while(aux != null){
                s = s + aux + "\n";
                aux = aux.getSiguiente();
            }
        }
        return s;
    }
    
    
}
