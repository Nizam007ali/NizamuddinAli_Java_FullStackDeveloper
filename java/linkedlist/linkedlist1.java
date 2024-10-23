/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.singlyLinkedlist;

/**
 *
 * @author nizam
 */
public class linkedlist1 {

    public void display(Node head) {
        if (head == null) {
            System.out.println("linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp= temp.next;
            }
        }
    }
    
    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        Node head = first;
        head.next = second;
        head.next.next = third;
        
        System.out.println("Print singly linkedlist data using head(display method)");
        linkedlist1 l1 = new linkedlist1();
        l1.display(head);
        
    }
}
