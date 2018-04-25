/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 * Explanatory title
 * @author Sergio Castillo (1513228)
 * @version 25-Apr-2018
 */
public class Node<T> {


// - - - - - <FIELDS> - - - - - //
    protected T data;
    protected Node next;
// - - - - - </FIELDS> - - - - - //


// - - - - - <CONSTRUCTOR> - - - - - //
    
    // Parametric constructor
    public Node( T data, Node next ){
        this.data = data;
        this.next = next;
    }
    
    // Partial constructor
    public Node( T data ){
        this.data = data;
        this.next = null;
    }
    
// - - - - - </CONSTRUCTOR> - - - - - //


// - - - - - <GETTERS AND SETTERS> - - - - - //
// - - - - - </GETTERS AND SETTERS> - - - - - //


// - - - - - <OTHER METHODS> - - - - - //
// - - - - - </OTHER METHODS> - - - - - //


}//End of class