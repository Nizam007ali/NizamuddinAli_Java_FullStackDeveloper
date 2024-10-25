/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.singlyLinkedlist;

/**
 *
 * @author nizam
 */
public class Dnode {

    public Dnode prev;
    public int data;
    public Dnode next;

    public Dnode(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }

    public void display(Dnode head) {
        Dnode temp = head;
        System.out.println("Doubly Linkedlist : ");
        while (temp.next != null) {
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
        System.out.print("-->" + temp.data);
        System.out.println();
        System.out.println();
    }

    public Dnode InsertAtFirst(Dnode head, int data) {
        Dnode new1 = new Dnode(data);
        new1.next = head;
        head.prev = new1;
        head = new1;
        return head;
    }

    public Dnode InsertAtLast(Dnode head, int data) {
        Dnode new1 = new Dnode(data);
        Dnode temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=new1;
        new1.prev=temp;
        return head;
    }

    public static void main(String[] args) {

        Dnode d1 = new Dnode(10);
        Dnode d2 = new Dnode(20);
        Dnode d3 = new Dnode(30);
        Dnode head = d1;
        d1.next = d2;
        d2.prev = d1;
        d2.next = d3;
        d3.prev = d2;

        head.display(head);

        head = head.InsertAtFirst(head, 5);
        head.display(head);
        head = head.InsertAtLast(head, 50);
        head.display(head);
    }
}
