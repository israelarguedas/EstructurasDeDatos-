/*
 * @author israa
 */

package com.mycompany.practicapc2.Problema1;

public class Lista {
    private Nodo cabeza;
    
    public void inserta (Persona p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
        } else if (p.getId()<cabeza.getDato().getId()){
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext()==null) {
            cabeza.setNext(new Nodo(p));
        } else {
            Nodo aux = cabeza;
            
            while(aux.getNext()!=null && 
                    aux.getNext().getDato().getId()<p.getId()){
                aux = aux.getNext();
            }
            
            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }
    
    public int size (){
        Nodo aux = cabeza;
        int counter = 0;
        
        if (aux == null){
            return counter;
        } else { 
            while (aux != null){
                aux = aux.getNext();
                counter = counter + 1; 
            }
            return counter;
        }
    }
    
    public boolean esVacia(){
        if (cabeza == null){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean existeValor(Persona p){
        Nodo aux = cabeza;
        
        while (aux.getNext() != null){
            if (aux.getDato().getId() == p.getId()){
                return true;
            } else{
                aux = aux.getNext();
            }
        }
        
        return false;
    }
    
    public int valorEn(int index){
        Nodo aux = cabeza;
        int counter = 0;
        
        while (index != counter){
            aux = aux.getNext();
            counter = counter+1; 
        }
        
        return aux.getDato().getId();
    }
    
    @Override
        public String toString(){
            Nodo aux = cabeza;
            String s = "Lista: ";
            while (aux != null){
                s+=aux+", ";
                aux = aux.getNext();
            }
            return s;
        }
}
