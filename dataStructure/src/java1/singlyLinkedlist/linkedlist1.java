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

    public void display(Node1 head) {
        if (head == null) {
            System.out.println("linked list is empty");
        } else {
            Node1 temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp= temp.next;
            }
        }
    }
    
    public static void main(String[] args) {
        
        Node1 first = new Node1(10);
        Node1 second = new Node1(20);
        Node1 third = new Node1(30);
        
        Node1 head = first;
        head.next = second;
        head.next.next = third;
        
        System.out.println("Print singly linkedlist data using head(display method)");
        linkedlist1 l1 = new linkedlist1();
        l1.display(head);
        
    }
}
