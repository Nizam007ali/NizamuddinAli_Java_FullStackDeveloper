/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

//3. Write a program in java to create a singly linked list of n nodes and count 
//the number of nodes.

import java.util.Scanner;

/**
 * 
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

public class Linkedlist3 {

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
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            r = 1;
        }
        return r;
    }

    public void Count() {
        Node temp = head;
        System.out.println("Data entered in the list are : ");
        int c = 0;
        while (temp != null) {
            System.out.println("Data = " + temp.data);
            c++;
            temp = temp.next;
        }
        System.out.println("Total number of nodes : " + c);
    }

    public void NumNodes() {
        System.out.print("Input the number of nodes : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Input data for node " + (i + 1) + " : ");
            int data = sc.nextInt();
            if (Nodes(data) > 0) {
                System.out.println("Node created");
            } else {
                System.out.println("Node not created");
            }
        }
    }

    public static void main(String[] args) {

        Linkedlist3 l = new Linkedlist3();
        l.NumNodes();
        l.Count();

    }

}
