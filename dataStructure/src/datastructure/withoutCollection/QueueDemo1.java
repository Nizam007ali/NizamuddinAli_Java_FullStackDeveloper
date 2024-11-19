/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.withoutCollection;

/**
 *
 * @author nizam
 */
public class QueueDemo1 {

    int q[] = new int[5], front = -1, rear = -1;

    boolean isFull() {
        return rear == q.length - 1;
    }

    boolean isEmpty() {
        return rear == - 1 && front == - 1;
    }

    public void enqueue(int n) {
        if (isFull()) {
            System.out.println("Queue is full.");
        } else {
            if (isEmpty()) {
                front++;
                rear++;
                q[rear] = n;
            } else {
                rear++;
                q[rear] = n;
            }
            System.out.println("Data tnserted on "+(rear));
        }
    }

    public int dequeue() {
        int r = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            if (rear == front) {
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
        QueueDemo1 qd = new QueueDemo1();
        qd.enqueue(10);
        qd.enqueue(20);
        qd.enqueue(30);
        qd.enqueue(40);
        qd.enqueue(50);
        qd.enqueue(60);
        System.out.println(qd.dequeue());
        System.out.println(qd.dequeue());
        System.out.println(qd.dequeue());
        System.out.println(qd.dequeue());
        System.out.println(qd.dequeue());
        System.out.println(qd.dequeue());
    }

}
