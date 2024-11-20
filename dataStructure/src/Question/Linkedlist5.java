/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question;

//5. Write a program in java to insert a new node at the end of a Singly 
import java.util.Scanner;

//Linked List. 
/**
 *
 * @author nizam
 */
public class Linkedlist5 {

    Node head = null;
    Scanner sc = new Scanner(System.in);

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

    public void Display() {
        Node temp = head;
        System.out.println("Data entered in the list are : ");
        int c = 0;
        while (temp != null) {
            System.out.println("Data = " + temp.data);
            c++;
            temp = temp.next;
        }
    }

    public void NumNodes() {
        System.out.print("Input the number of nodes : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Input data for node " + (i + 1) + " : ");
            int data = sc.nextInt();
            if (Nodes(data) > 0) {
//                System.out.println("Node created");
            } else {
                System.out.println("Node not created");
            }
        }
    }

    public void insertAtLast() {
        System.out.print("Input data to insert at the end of the list : ");
        int data = sc.nextInt();
        Node n1 = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
    }

    public static void main(String[] args) {

        Linkedlist5 l = new Linkedlist5();
        l.NumNodes();
        l.Display();
        l.insertAtLast();
        l.Display();

    }

}
