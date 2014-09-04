/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debora
 */
public class NodoListaInicial extends NodoLista{
    
    public NodoListaInicial(NodoLista siguiente){
        super(siguiente);
    }
    
    public int verTamanio(){
        return siguiente.verTamanio();
    }
    
    public Object verDato(){
        return siguiente.verDato();
    }
    
    public NodoLista verSiguiente(){
        return siguiente.verSiguiente();
    }
    
    public void asignarSiguiente(NodoLista nuevoSiguiente){
        siguiente = nuevoSiguiente;
    }    
}
