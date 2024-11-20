/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

//2. Write a program in Java to create a singly linked list of n nodes and 
//display it in reverse order.


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

public class Linkedlist2 {

    Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public Node Nodes(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        return head;
    }

    public void DisplayB(int n) {
        for (int i = n - 1; i >= 0; i--) {
            Node temp = head;
            int j=i;
            while(j>0) {
                temp = temp.next;
                j--;
            }
            System.out.print("-->"+temp.data);
        }
    }

    public Node NumNodes(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data : ");
            int data = sc.nextInt();
            head = Nodes(data);
        }
        return head;
    }

    public static void main(String[] args) {

        System.out.print("Enter number of nodes : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Linkedlist2 l = new Linkedlist2();
        Node head = l.NumNodes(n);
        l.DisplayB(n);

    }

}
