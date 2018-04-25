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
public class LinkedList {


// - - - - - <FIELDS> - - - - - //
    protected Node first;
// - - - - - </FIELDS> - - - - - //


// - - - - - <CONSTRUCTOR> - - - - - //
    public LinkedList( Node first ){
        this.first = first;
    }
// - - - - - </CONSTRUCTOR> - - - - - //


// - - - - - <GETTERS AND SETTERS> - - - - - //
    
    /**
     * Add a node to the end of the list
     * @param newNode 
     */
    public void add(Node newNode){
        // Create a node that will hold the final node
        Node node;
        // Iterate until the last one
        // for( FIRST ; LAST ; NEXT ){
        for( node = this.first ; node.next != null ; node = node.next ){
            // Do nothing, because we want to get to the last one
        }
        node.next = newNode;
    }
    
    /**
     * Insert a node after certain node
     * @param newNode
     * @param previous 
     */
    public void insert(Node newNode, Node previous){
        // Iterate through the array
        for( Node node = this.first ; node != null ; node = node.next ){
            // If the current node is the "previous one"
            if( node == previous ){
                // The next one of the new node is the next one of the previous
                newNode.next = previous.next;
                // The next one of the previous is now the new node
                previous.next = newNode;
            }
        }
    }
    
    /**
     * Delete a node from the Linked List
     * @param nodeToDelete 
     */
    public void delete( Node nodeToDelete ){
        // If the first one is the one to delete
        if( this.first == nodeToDelete ){
            // The first node becomes the one after the deleted node
            this.first = this.first.next;
        } else {
            // Iterate through the array
            for( Node node = this.first ; node.next != nodeToDelete ; node = node.next ){
                // If the next of the current node is the one to delete
                if( node.next == nodeToDelete ){
                    // Previous becomes the current node
                    Node previous = node;

                    /*
                    // Delete becomes the one after previous
                    Node delete = node.next;
                    // Next becomes the one after the one to delete
                    Node nextOne = delete.next;
                    // The previous makes reference to the next of the next
                    previous.next = nextOne;
                    */

                    // The previous makes reference to the next of the next
                    previous.next = previous.next.next;
                }// End of condition
            }//End of loop
        }// End of else
    }// End of function
    
    /**
     * Search for a node and output its info
     * @param nodeToSearch
     * @return Info of the node
     */
    public String search( Node nodeToSearch ){
        // Creating the output string
        String output = "Node:[";
        // Creating an empty node that will later be filled by the node
        Node node;
        // Iterate until the wanted node is found
        for( node = this.first ; node != nodeToSearch ; node = node.next ){
            // Do nothing, because we just want to get to the node we want
        }
        // Filling the output with information and returning it
        output += "data: " + node.data.toString() + ", next: " + node.next.data.toString() + "]";
        return output;
    }
    
    /**
     * Get the index of a node
     * @param nodeToIndex
     * @return index
     */
    public int indexOf( Node nodeToIndex ){
        // Generating the position as 1
        int position = 1;
        // Iterate until the node is the wanted one
        for( Node node = this.first ; node != nodeToIndex ; node = node.next ){
            // Increase the position by 1
            position ++;
        }
        // Return the position
        return position;
    }
    
    /**
     * Get a node by its position
     * @param position
     * @return node
     */
    public Node getNode( int position ){
        // Declare an empty node
        Node indexedNode = null;
        // Node in the list
        Node node = this.first;
        // Iterate the positioned number of times
        for( int i = 0 ; i < position || node != null; i ++ ){
            // The indexed node is now the current node
            indexedNode = node;
            // Move on to the next node
            node = node.next;
        }
        // Return the indexed node
        return indexedNode;
    }
    
// - - - - - </GETTERS AND SETTERS> - - - - - //


// - - - - - <OTHER METHODS> - - - - - //
    
    /**
     * Return a string with all the elements of the list
     * @return 
     */
    public String toString(){
        String output = "";
        
        for( Node node = this.first ; node != null ; node = node.next ){
            output += " - " + node.data.toString() + "\n";
        }
        return output;
    }
// - - - - - </OTHER METHODS> - - - - - //


}//End of class