/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debora
 */

public class Lista {
    private NodoLista nodoPrimero;
    
    public Lista(){
        nodoPrimero = new NodoListaInicial(new NodoListaFinal());
    }
    
    public boolean esVacia(){
        return (nodoPrimero.verTamanio() == 0);
    }
    
    public int verTamanio(){
        return nodoPrimero.verTamanio();
    }
    
    public void insertarAlFinal(Object dato){
        nodoPrimero.insertarAContinuacion(dato);
    }
    
    public Object verPrimero() throws AssertionError{
        return nodoPrimero.verDato();
    }
    
    public void borrarPrimero() throws AssertionError{
        nodoPrimero.asignarSiguiente(nodoPrimero.verSiguiente());
    }
}
