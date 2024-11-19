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

    public Node addNodeAtLast(Node head, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        if (temp == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public void display(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print("======>" + temp.data);//10==>20==>30
                temp = temp.next;
            }
        }
    }

    public Node addNodeAtStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node addAtPos(Node head, int pos, int data) {
        Node newNode = new Node(data);
        Node temp1 = head;
        Node temp2 = head.next;

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        pos--;//3
        while (pos > 1) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos--;//1
        }
        temp1.next = newNode;
        newNode.next = temp2;
        return head;
    }

    public Node deleteFirstNode(Node head) {
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    public Node deleteLastNode(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public Node deleteNodeAtPos(Node head, int pos) {
        pos--;
        Node temp1 = head;
        Node temp2 = head.next;
        while (pos > 1) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos--;
        }
        temp1.next = temp2.next;
        temp2 = null;
        return head;
    }

    public static void main(String[] args) {
        //step1 : Create First Node of Singly List
        Node first = new Node(10);
        //step2: Create Second Node of Singly Linked List
        Node second = new Node(20);
        //step3: Create Third Node of Singly Linked List
        Node third = new Node(30);
        //step4: Connect First Node to second Node
        Node head = first;
        head.next = second;
//step5: Connect Second Node to Third Node
        head.next.next = third;

        System.out.println("\nPrint Singly Linked List Data Before Add New Node at Last");
        head.display(head);
        head.addNodeAtLast(head, 40);
        System.out.println("\nPrint Singly Linked List Data After Add New Node at Last");
        head.display(head);
        System.out.println("\nPrint Singly Linked List Data add Before New Node at Start");
        head = head.addNodeAtStart(head, 5);
        head.display(head);
        System.out.println("\nPrint Singly Linked List Data After Before New Node at Start");

        System.out.println("\nPrint Data before add new Node at Specific Position ");
        head = head.addAtPos(head, 4, 25);
        head = head.addAtPos(head, 1, 2);
        head.display(head);

        System.out.println("\nPrint Data After Delete First Node of Singly Linked List");
        head = head.deleteFirstNode(head);
        head.display(head);

        System.out.println("\nPrint Data After Delete last Node of Singly Linked List");
        head = head.deleteLastNode(head);
        head.display(head);

    }
}
