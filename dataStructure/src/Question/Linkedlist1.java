/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;


//1. Write a program in Java to create and display Singly Linked List

import java.util.Scanner;

/**
 *
 * @author nizam
 */

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}

public class Linkedlist1 {

    Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public int Nodes(int data) {
        int r = 0;
        Node n = new Node(data);
        if (isEmpty()) {
            head = n;
            r = 1;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
            r = 1;
        }
        return r;
    }

    public void Display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print("==>"+temp.data);
            temp = temp.next;
        }
    }

    public void NumNodes() {
        System.out.print("Enter number of nodes : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            int data = sc.nextInt();
            if(Nodes(data)>0) {
            System.out.println("Node created");
            } else {
            System.out.println("Node not created");
            }
        }
    }

    public static void main(String[] args) {

        Linkedlist1 l = new Linkedlist1();
        l.NumNodes();
        l.Display();
        
    }

}
