/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sllstack;

import java.util.LinkedList;

/**
 * Explanatory title
 * @author Sergio Castillo (1513228)
 * @version 25-Apr-2018
 */
public class SLLStack {


// - - - - - <FIELDS> - - - - - //
    private LinkedList<Object> sllStack;
// - - - - - </FIELDS> - - - - - //


// - - - - - <CONSTRUCTOR> - - - - - //
    public SLLStack(){
        this.sllStack = new LinkedList<>();
    }
// - - - - - </CONSTRUCTOR> - - - - - //


// - - - - - <GETTERS AND SETTERS> - - - - - //
    public Object[] elements(){
        Object[] elements = new Object[this.sllStack.size()];
        for( int i = this.sllStack.size()-1, j = 0 ; i > 0 ; i--, j++ ){
            elements[j] = this.sllStack.get(i);
        }
        return elements;
    }
    
    public int size(){
        return sllStack.size();
    }
    
    public void push(Object element){
        this.sllStack.add(0, element);
    }
// - - - - - </GETTERS AND SETTERS> - - - - - //


// - - - - - <OTHER METHODS> - - - - - //
    
// - - - - - </OTHER METHODS> - - - - - //


}//End of class