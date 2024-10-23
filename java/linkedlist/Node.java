/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.singlyLinkedlist;

/**
 *
 * @author nizam
 */
public class Node {
    
    public int data;
    public Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        Node head = first;
        head.next = second;
        head.next.next = third;
        
        System.out.println("Print singly linkedlist data using head");
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        
    }
}
