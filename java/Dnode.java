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

    public int CountDNode(Dnode head) {
        int r = 0;
        Dnode temp = head;
        while (temp != null) {
            r++;
            temp = temp.next;
        }
        return r;
    }

//    public Dnode InsertAtFirst(Dnode head, int data) {
//        Dnode new1 = new Dnode(data);
//        new1.next = head;
//        head.prev = new1;
//        head = new1;
//        return head;
//    }
//
//    public Dnode InsertAtLast(Dnode head, int data) {
//        Dnode new1 = new Dnode(data);
//        Dnode temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = new1;
//        new1.prev = temp;
//        return head;
//    }
    public Dnode InsertDnode(Dnode head, int data, int pos) {
        Dnode new1 = new Dnode(data);
        if (pos == 1) {
            new1.next = head;
            head.prev = new1;
            head = new1;
        } else if (pos == (head.CountDNode(head) + 1)) {
            Dnode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new1;
            new1.prev = temp;
        } else {
            pos--;
            Dnode temp1 = head;
            Dnode temp2 = head.next;
            while (pos > 1) {
                temp1 = temp1.next;
                temp2 = temp2.next;
                pos--;
            }
            temp1.next = new1;
            new1.prev = temp1;
            new1.next = temp2;
            temp2.prev = new1;
        }
        return head;
    }

    public Dnode deleteDnode(Dnode head, int pos) {

        Dnode temp1 = head;
        Dnode temp2 = head.next;
        if (pos == 1) {
            temp1.next = null;
            head = temp2;
            temp2.prev = null;
        } else if (pos == CountDNode(head)) {
            while (temp2.next != null) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            temp1.next = null;
            temp2.prev = null;
        } else {
            pos--;
            while (pos > 1) {
                temp1 = temp1.next;
                temp2 = temp2.next;
                pos--;
            }
            temp1.next = temp2.next;
            temp2.next.prev = temp2.prev;
        }

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

//        head = head.InsertAtFirst(head, 5);
//        head.display(head);
//        head = head.InsertAtLast(head, 50);
//        head.display(head);
        head = head.InsertDnode(head, 5, 1);
        head.display(head);
        head = head.InsertDnode(head, 50, 5);
        head.display(head);
        head = head.InsertDnode(head, 25, 4);
        head.display(head);

        head = head.deleteDnode(head, 1);
        head.display(head);
        head = head.deleteDnode(head, 5);
        head.display(head);
        head = head.deleteDnode(head, 3);
        head.display(head);

    }
}
