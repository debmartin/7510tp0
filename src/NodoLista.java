/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debora
 */
public class NodoLista {
    protected NodoLista siguiente;
    private Object dato;
    
    public NodoLista(){
    }
    
    public NodoLista(NodoLista siguiente){
        this.siguiente = siguiente;
    }
    
    public NodoLista(Object dato, NodoLista siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public int verTamanio(){
        return (1 + siguiente.verTamanio());
    }
    
    public void insertarAContinuacion(Object dato){
        insertarAContinuacion(dato, this);
    }
    
    protected void insertarAContinuacion(Object dato, NodoLista anterior){
        siguiente.insertarAContinuacion(dato, this);
    }
    
    public Object verDato(){
        return dato;
    }
    
    public NodoLista verSiguiente(){
        return siguiente;
    }
    
    public void asignarSiguiente(NodoLista nuevoSiguiente){
        siguiente = nuevoSiguiente;
    }
}
