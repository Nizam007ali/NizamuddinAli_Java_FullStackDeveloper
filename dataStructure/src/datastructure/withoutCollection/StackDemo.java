/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.withoutCollection;

/**
 *
 * @author nizam
 */
public class StackDemo {

    int top = -1;
    int stack[] = new int[5];

    boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(int data) {
        //step1: to check over flow condition
        if (isFull()) {
            System.out.println("Over flow Condition");
            return;
        } else {
            //step2: increase value of top by 1
            top++;
            stack[top] = data;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() {
        int r = -1;
        if (isEmpty()) {
            System.out.println("Under Flow Condition");
        } else {
            r = stack[top];
            top--;
        }
        return r;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return stack[top];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty ");
        } else {
            System.out.println("Stack elements Are : ");
            for (int i = top; i >= 0; i--) {
                System.out.println("===>" + stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        // s.push(60);
        s.display();
        System.out.println("Deleted Element : " + s.pop());
        System.out.println("Deleted Element : " + s.pop());
        System.out.println("Top Element : " + s.peek());
        System.out.println("Deleted Element : " + s.pop());
        System.out.println("Deleted Element : " + s.pop());
        System.out.println("Deleted Element : " + s.pop());
    }
}
