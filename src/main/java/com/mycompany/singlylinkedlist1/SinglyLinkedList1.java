/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.singlylinkedlist1;

/**
 *
 * @author kamau
 */
public class SinglyLinkedList1 {

    //defining a node in singly linked list  
    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //defining the head and tail of a singly linked list   
    public Node head;
    public Node tail;

    //defining insert() function to add a node to the list   
    public void insert(int data) {
        //Creating a new node   
        Node newNode = new Node(data);
        //checking of the list is empty   
        if (head == null) {
//if the given list is empty, making the two nodes head and tail to point to the newly created node newNode    
            head = newNode;
            tail = newNode;
        } else {
//otherwise the newNode will be added after tail so that the next pointer of tail points to    the newNode   
            tail.next = newNode;
            tail = newNode;
        }
    }

//how to delete a node from the end
    public void deleteFromEnd() {

        if (head == null) {
            System.out.println("the list is empty");
        } else {
            if (head != tail) { //to show head is not the tail
                Node current = head;
                while (current.next != tail) { //to show that the last element is second last
                    current = current.next;
                }
                tail = current;   // //Second last element will become new tail of the list 
                tail.next = null;
            } else {  //if the list contains only one element, it will remove it
                head = tail = null;
            }

        }

    }

    //defining displaylist() function to display the data in the list  
    public void displaylist() {
        //Pointing the head to the node called current    
        Node current = head;
        if (head == null) {
            System.out.println("The given list is empty");
            return;
        }
        System.out.println("The data in the given list are: ");
        while (current != null) {
            //printing each data in the list and next pointer pointing to the next node   
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //creating a new list    
        SinglyLinkedList1 newList = new SinglyLinkedList1();
        //Adding data to the list by calling the insert function  
        newList.insert(10);
        newList.insert(30);
        newList.insert(50);
        newList.insert(70);
        newList.insert(100);
        //Displaying the data in the list by calling displaylist() function    
        newList.displaylist();

        while (newList.head != null) {
            newList.deleteFromEnd();
            System.out.println("the new list is:");
            newList.displaylist();
            break;
        }
    }
}
