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

    public Node1 addNodeAtLast(Node1 head, int data) {
        Node1 newNode = new Node1(data);
        Node1 temp = head;
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
    
    public Node1 addNodeAtStart(Node1 head, int data) {
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head=newNode;
        return head;
    }

    public static void main(String[] args) {
        
        Node1 first = new Node1(10);
        Node1 second = new Node1(20);
        Node1 third = new Node1(30);
        
        Node1 head = first;
        head.next = second;
        head.next.next = third;
        
        System.out.println("Print singly linkedlist data using head(display method) before adding new element");
        linkedlist1 l1 = new linkedlist1();
        l1.display(head);
        
        System.out.println("Print singly linkedlist data using head(display method) after adding new element at ebd");
        linkedlist2 l2 = new linkedlist2();
        head = l2.addNodeAtLast(head,40);
        l1.display(head);
        
        System.out.println("Print singly linkedlist data using head(display method) before adding new element at last");
        l2.addNodeAtStart(head,5);
        l1.display(head);
        
    }
}
