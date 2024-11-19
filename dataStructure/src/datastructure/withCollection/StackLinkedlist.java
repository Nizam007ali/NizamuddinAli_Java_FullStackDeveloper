/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.withCollection;

/**
 *
 * @author nizam
 *
 */
class Node {

    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

}

public class StackLinkedlist {

    Node front = null;
    Node rear = null;

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public void display() {
        Node temp = front;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        while (temp != null) {
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
    }

    public void push(int x) {
        Node new1 = new Node(x);
        if (isEmpty()) {
            front = new1;
            rear = new1;
            System.out.println("First element inserted.");
        } else {
            rear.next = new1;
            new1.prev = rear;
            rear = new1;
            System.out.println("Another element inserted.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else if (rear == front) {
            int r = rear.data;
            rear = null;
            front = null;
            return r;
        } else {
            int r = rear.data;
            rear = rear.prev;
            rear.next = null;
            return r;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            return rear.data;
        }
    }

    public static void main(String[] args) {

        StackLinkedlist sl = new StackLinkedlist();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.push(40);
        sl.push(50);
        sl.display();
        System.out.println();
        System.out.println("popped-->" + sl.pop());
        sl.display();
        System.out.println();
        System.out.println("popped-->" + sl.pop());
        sl.display();
        System.out.println();
        System.out.println("popped-->" + sl.pop());
        System.out.println("peeked-->" + sl.peek());
        sl.display();
        System.out.println();
        System.out.println("popped-->" + sl.pop());
        sl.display();
        System.out.println();
        System.out.println("popped-->" + sl.pop());
        sl.display();
        System.out.println();
        System.out.println("popped-->" + sl.pop());
        sl.display();
        System.out.println();

    }

}
