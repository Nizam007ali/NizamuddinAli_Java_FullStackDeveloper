/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.singlyLinkedlist;

/**
 *
 * @author nizam
 */
public class linkedlist2 {

    public Node addNodeAtLast(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if(temp==null) {
            head = newNode;
        } else {
            while(temp.next==null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        Node head = first;
        head.next = second;
        head.next.next = third;
        
        System.out.println("Print singly linkedlist data using head(display method) before adding new element");
        linkedlist1 l1 = new linkedlist1();
        l1.display(head);
        
        System.out.println("Print singly linkedlist data using head(display method) before adding new element");
        linkedlist2 l2 = new linkedlist2();
        l2.addNodeAtLast(head,40);
        l1.display(head);
        
    }
}
