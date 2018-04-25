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
    
    /**
     * LinkedList that will contain the stack
     */
    private LinkedList<Object> sllStack;
    
// - - - - - </FIELDS> - - - - - //


// - - - - - <CONSTRUCTOR> - - - - - //
    
    /**
     * Default constructor
     */
    public SLLStack(){
        // Creating an empty list to contain the stack
        this.sllStack = new LinkedList<>();
    }
    
// - - - - - </CONSTRUCTOR> - - - - - //


// - - - - - <GETTERS AND SETTERS> - - - - - //
    
    /**
     * Produce an array containing all the elements from the stack, from bottom to top
     * @return array
     */
    public Object[] elements(){
        // Create an array with the size of the stack
        Object[] elements = new Object[this.sllStack.size()];
        // Iterate on opposing directions through the array and the list
        for( int i = this.sllStack.size()-1, j = 0 ; i > 0 ; i--, j++ ){
            // Asigning the element in the i position of the list to the j position of the array
            elements[j] = this.sllStack.get(i);
        }
        // Return the elements array
        return elements;
    }
    
    /**
     * Get the size of the stack
     * @return stack size
     */
    public int size(){
        // Return the size of the stack
        return sllStack.size();
    }
    
    /**
     * Push a new object to the top of the stack
     * @param Object to push
     */
    public void push(Object element){
        // Push a new element on position 0 of the list (Top of the stack)
        this.sllStack.add(0, element);
    }
    
    /*
     * Pull (delete) an object from the top of the array
     */
    public void pull(){
        // Remove the element from the top of the stack, position 0 of the Linked List
        this.sllStack.remove(0);
    }
    
    /**
     * Peek the element at the top of the stack
     * @return top of the stack object
     */
    public Object peek(){
        // Return the element at the beginning of the Linked List
        return this.sllStack.get(0);
    }
    
// - - - - - </GETTERS AND SETTERS> - - - - - //


// - - - - - <OTHER METHODS> - - - - - //
    
// - - - - - </OTHER METHODS> - - - - - //


}//End of class
