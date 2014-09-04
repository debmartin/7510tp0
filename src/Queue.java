/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Debora Martin
 */
interface Queue { 
        boolean isEmpty(); 
        int size(); 
        void add(Object item); // agregar un item 
        Object top(); // retornar el primer item, lanzar exception si esta vacío. 
        void remove(); // remover el primer item, lanzar exception si esta vacío. 
    } 
