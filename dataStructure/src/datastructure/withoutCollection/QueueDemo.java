/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.withoutCollection;

/**
 *
 * @author nizam
 */
public class QueueDemo {

    int q[] = new int[5];
    int front = -1;
    int rear = -1;

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isfull() {
        return rear == q.length - 1;
    }

    public void enqueue(int data) {
        if (isfull()) {
            System.out.println("Overflow Condition");
        } else {
            if (isEmpty()) {
                front++;
                rear++;
                q[rear] = data;
                System.out.println("First element inserted");
            } else {
                rear++;
                q[rear] = data;
                System.out.println("another element other than first element inserted");
            }
        }
    }

    public int dequeue() {
        int r = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return r;
        } else {
            if (front == rear) {
                r = q[front];
                front = -1;
                rear = -1;
            } else {
                r = q[front];
                front++;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        QueueDemo qd = new QueueDemo();
        qd.enqueue(10);
        qd.enqueue(20);
        qd.enqueue(30);
        qd.enqueue(40);
        qd.enqueue(50);
        qd.enqueue(60);
        System.out.println("Deleted element : " + qd.dequeue());
        System.out.println("Deleted element : " + qd.dequeue());
        System.out.println("Deleted element : " + qd.dequeue());
        System.out.println("Deleted element : " + qd.dequeue());
        System.out.println("Deleted element : " + qd.dequeue());
        System.out.println("Deleted element : " + qd.dequeue());
    }
}
