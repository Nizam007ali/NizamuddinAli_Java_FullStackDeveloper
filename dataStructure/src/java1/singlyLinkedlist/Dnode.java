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

    public void displayF(Dnode head) {
        Dnode temp = head;
        System.out.println("Doubly Linkedlist in Forward direction: ");
        while (temp != null) {
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
        System.out.println();
        System.out.println();
    }

    public void displayB(Dnode tail) {
        Dnode temp = tail;
        System.out.println("Doubly Linkedlist in Backward direction: ");
        while (temp != null) {
            System.out.print("-->" + temp.data);
            temp = temp.prev;
        }
        System.out.println();
        System.out.println();
    }

    public int length(Dnode head) {
        int r = 0;
        Dnode temp = head;
        while (temp != null) {
            r++;
            temp = temp.next;
        }
        return r;
    }

    public Dnode[] Insert(Dnode head, Dnode tail, int data, int pos) {
        Dnode arr[] = new Dnode[2];
        if (pos == 1) {
            Dnode new1 = new Dnode(data);
            new1.next = head;
            head.prev = new1;
            head = new1;
        } else if (pos == head.length(head)) {
            Dnode new1 = new Dnode(data);
            Dnode temp = tail;
            tail.next = new1;
            new1.prev = tail;
            tail = new1;
        } else {
            pos--;
            Dnode new1 = new Dnode(data);
            Dnode temp1 = head;
            Dnode temp2 = head.next;
            while (pos != 1) {
                temp1 = temp1.next;
                temp2 = temp2.next;
                pos--;
            }
            temp1.next = new1;
            new1.prev = temp1;
            new1.next = temp2;
            temp2.prev = new1;
        }
        arr[0] = head;
        arr[1] = tail;
        return arr;
    }

    public Dnode InsertAtFirst(Dnode head, int data) {
        Dnode new1 = new Dnode(data);
        new1.next = head;
        head.prev = new1;
        head = new1;
        return head;
    }

    public Dnode InsertAtLast(Dnode tail, int data) {
        Dnode new1 = new Dnode(data);
        tail.next = new1;
        new1.prev = tail;
        tail = new1;
        return tail;
    }

    public Dnode InsertAtSpecific(Dnode head, int pos, int data) {
        pos--;
        Dnode new1 = new Dnode(data);
        Dnode temp1 = head;
        Dnode temp2 = head.next;
        while (pos != 1) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos--;
        }
        temp1.next = new1;
        new1.prev = temp1;
        new1.next = temp2;
        temp2.prev = new1;
        return head;
    }

    public Dnode DeleteAtFirst(Dnode head) {
        Dnode temp = head;
        head = temp.next;
        temp = null;
        return head;
    }

    public Dnode DeleteAtLast(Dnode head, Dnode tail) {
        Dnode temp = tail;
        Dnode temp1 = tail.prev;
        System.out.println("tail " + temp.data);
        tail = temp1;
        tail.next = null;
        temp = null;
        return head;
    }

    public Dnode DeleteAtSpecific(Dnode head, int pos) {
        pos--;
        Dnode temp1 = head;
        Dnode temp2 = head.next;
        while (pos != 1) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            System.out.println(temp1.data);
            pos--;
        }
        temp1.next = temp2.next;
        temp2.prev = temp1.prev;
        temp2 = null;
        return head;
    }

    public static void main(String[] args) {
        Dnode d1 = new Dnode(10);
        Dnode d2 = new Dnode(20);
        Dnode d3 = new Dnode(30);
        d1.next = d2;
        d2.prev = d1;
        d2.next = d3;
        d3.prev = d2;
        Dnode head = d1;
        Dnode tail = d3;

        head.displayF(head);
        head.displayB(tail);

        Dnode arr[] = head.Insert( head, tail, 5, 1);
        head = arr[0];
        tail= arr[1];
        head.displayF(head);
        tail = head.InsertAtLast(tail, 50);
        head.displayF(head);
        head = head.InsertAtSpecific(head, 4, 25);
        head.displayF(head);
        head = head.DeleteAtFirst(head);
        head.displayF(head);
        head = head.DeleteAtLast(head, tail);
        head.displayF(head);
        head = head.DeleteAtSpecific(head, 3);
        head.displayF(head);
        System.out.println("Size : " + head.length(head));
    }
}
