/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

/**
 *
 * @author 1513228
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Declaring an empty stack
        ArrayStack books = new ArrayStack(10);
        
        // Push some objects to the stack
        books.push("Le petit prince");
        books.push("Emperor's new clothes");
        books.push("Anna Frank's diary");
        
        // Print the stack
        System.out.println( "Pushed elements to the stack:\n" + books.toString() );
        
        // Get the stack size
        System.out.println("Stack size:\n" + books.getSize() + "\n") ;
        
        // Pull an object from the stack
        books.pull();
        System.out.println("Pulled elements from the stack:\n" + books.toString());
        
        //books.testArray();
        
        // Peek an element from the stack
        System.out.println("Peek an element from the stack:\n" + books.peek());
        
    }
    
}
