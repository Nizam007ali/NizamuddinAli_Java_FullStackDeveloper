/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure.withoutCollection;

/**
 *
 * @author nizam
 */
public class stackdemo1 {

    int top = -1;
    int stack[] = new int[5];

    boolean isFull() {
        return top == stack.length;
    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return 0;
        } else {
            top++;
            stack[top] = data;
            return 1;
        }
    }
    
    boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("No data to show");
        } else {
            System.out.println("Stack elements are : ");
            for( int i=top; i>=0; i--) {
                System.out.println(i+1+"---->"+stack[i]);
            }
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int r = stack[top];
            top--;
            return r;
        }
    }
    
    public static void main(String[] args) {
        stackdemo1 sd = new stackdemo1();
        sd.push(10);
        sd.push(20);
        sd.push(30);
        sd.push(40);
        sd.push(50);
        sd.display();
        System.out.println("pop --->"+sd.pop());
        System.out.println("pop --->"+sd.pop());
        System.out.println("pop --->"+sd.pop());
        System.out.println("peek --->"+sd.peek());
        System.out.println("pop --->"+sd.pop());
        System.out.println("peek --->"+sd.peek());
        System.out.println("pop --->"+sd.pop());
        System.out.println("peek --->"+sd.peek());
        System.out.println("pop --->"+sd.pop());
    }
}
