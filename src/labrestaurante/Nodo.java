/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrestaurante;
/**
 *
 * @author marvin
 */
public class Nodo {
    
    Object valor;
    Nodo siguiente;
    
    public Nodo (Object valor){
        
        this.valor = valor;
        this.siguiente = null;
    }
    
    public Object obtenervalor(){
        return valor;
    }
    
    public void enlazarSiguiente(Nodo n){
        siguiente = n;
    }
    
    public Nodo obtenersiguiente(){
        return siguiente;
    }
    
}
