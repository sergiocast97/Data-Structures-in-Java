/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraystack;

/**
 * Explanatory title
 * @author Sergio Castillo (1513228)
 * @version 25-Apr-2018
 */
public class ArrayStack<T> {

// - - - - - <FIELDS> - - - - - //
    
    /**
     * Array that will contain the stack
     */
    private Object[] stack;
    
    /**
     * Size of the stack with the last element added
     */
    private int size;
    
// - - - - - </FIELDS> - - - - - //


// - - - - - <CONSTRUCTOR> - - - - - //
    
    /**
     * Maximum size of the stack
     * @param maxSize 
     */
    public ArrayStack(int maxSize){
        stack = new Object[maxSize];
        // Since the stack is empty, it's set to 0
        this.size = 0;
    }
    
// - - - - - </CONSTRUCTOR> - - - - - //


// - - - - - <GETTERS AND SETTERS> - - - - - //
    
    /**
     * Get the size of the stack
     * @return size
     */
    public int getSize(){
        // Stack size so far
        return this.size;
    }
    
    /**
     * Add a new element on the top of the stack
     * @param element 
     */
    public void push( Object element ){
        // Push the element to the position newSize-1 (Last element)
        stack[this.size] = element;
        // Increase the stack size
        this.size++;
    }
    
    /**
     * Delete the element from the top of the stack
     */
    public void pull(){
        // Delete the element from the position size-1 (Last element)
        stack[this.size-1] = null;
        // Decrease the stack size
        this.size--;
    }
    
    /**
     * Peek the element at the top of the stack
     * @return 
     */
    public Object peek(){
        // Return the element from the position size-1 (Last element)
        return stack[this.size-1];
    }
    
// - - - - - </GETTERS AND SETTERS> - - - - - //


// - - - - - <OTHER METHODS> - - - - - //
    
    /**
     * toString method
     * @return all the stack elements
     */
    public String toString(){
        // Declare an empty string for the output
        String output = "";
        // Iterate from the size of the stack to 0
        for( int i = this.size-1 ; i >= 0 ; i-- ){
            output += " - " + stack[i].toString() + "\n";
        }
        return output;
    }
    
    /**
     * Print the stack's array
     * For debugging purposes only
     */
    protected void testArray(){
        System.out.println("Testing stack array:");
        // Iterating through the array
        for( int i = 0 ; i < stack.length ; i++ ){
            // Print what's in the array
            if( stack[i] == null ){
                System.out.println("Null");
            } else {
                System.out.println( stack[i]);
            }
        }
    }
    
// - - - - - </OTHER METHODS> - - - - - //

}//End of class