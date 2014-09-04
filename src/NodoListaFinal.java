/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debora
 */

public class NodoListaFinal extends NodoLista{
    final int TAMANIO = 0;
    
    public NodoListaFinal(){
        super();
    }
    
    @Override
    public int verTamanio(){
        return TAMANIO;
    }
    
    @Override
    public void insertarAContinuacion(Object dato, NodoLista anterior){
        anterior.asignarSiguiente(new NodoLista(dato, this));
    }
    
    @Override
    public Object verDato(){
        throw new AssertionError("Dato vacio");
    }
    
    @Override
    public NodoLista verSiguiente(){
        throw new AssertionError("Nodo Final");
    }
    
    @Override
    public void asignarSiguiente(NodoLista nuevoSiguiente){
        throw new AssertionError("Nodo Final");
    }
    
}
