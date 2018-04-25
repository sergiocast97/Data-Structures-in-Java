/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author 1513228
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create test nodes, having the object (String) and the next node
        Node<String> cheetah = new Node("Cheetah");
        Node<String> zebra = new Node("Zebra", cheetah );
        Node<String> lion = new Node( "Lion", zebra );
        
        // Create the linked list, with the first element
        LinkedList zoo = new LinkedList(lion);
        
        // Test by printing
        System.out.println( "Printing the list:\n" + zoo.toString() );
        
        // Create new node
        Node boar = new Node("Boar");
        zoo.add(boar);
        //zoo.add( new Node("Boar") );
        System.out.println( "Adding a new node:\n" + zoo.toString() );
        
        // Insert new node
        Node cat = new Node( "Cat");
        zoo.insert(cat,boar);
        System.out.println( "Inserting a new node:\n" + zoo.toString() );
        
        // Delete a node
        zoo.delete(cat);
        System.out.println( "Deleting a node:\n" + zoo.toString());
        
        // Search for an element
        System.out.println( "Search for a node:\n" + zoo.search( cheetah ) + "\n");
        
        // Get the index of an element
        System.out.println( "Getting the index of a node:\n" + zoo.indexOf(cheetah) + "\n");
        
        // Get a node by index
        System.out.println( "Getting a node by its index:\n" + zoo.getNode(3).data);
    }
}
