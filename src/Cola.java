/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debora
 */

public class Cola implements Queue {
    private Lista lista = new Lista();
    
    @Override
    public boolean isEmpty(){
        return lista.esVacia();
    }
    
    @Override
    public int size(){
        return lista.verTamanio();
    }
    
    @Override
    public void add(Object item){
        lista.insertarAlFinal(item);
    }
    
    @Override
    public Object top() throws AssertionError{
        return lista.verPrimero();
    }
    
    @Override
    public void remove() throws AssertionError{
        lista.borrarPrimero();
    }

}
