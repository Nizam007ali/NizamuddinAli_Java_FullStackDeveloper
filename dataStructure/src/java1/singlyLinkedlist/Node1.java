/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1.singlyLinkedlist;

/**
 *
 * @author nizam
 */
public class Node1 {

    public int data;
    public Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }

    public void display(Node1 head) {
        Node1 temp = head;
        if (temp == null) {
            System.out.println("Linkedlist is empty");
        } else {
            while (temp != null) {
                System.out.print("-->" + temp.data);
                temp = temp.next;
            }
            System.out.println();
            System.out.println();
        }
    }

    public Node1 insertAtFirstPos(Node1 head, int data) {
        Node1 new1 = new Node1(data);
        new1.next = head;
        head = new1;
        return head;
    }

    public Node1 insertAtLastPos(Node1 head, int data) {
        Node1 new1 = new Node1(data);
        Node1 temp = head;
        if (temp == null) {
            head = new1;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new1;
        }
        return head;
    }

    public Node1 insertAtSpePos(Node1 head, int data, int pos) {
        pos--;
        Node1 new1 = new Node1(data);
        Node1 temp = head;
        Node1 temp1 = head.next;
        if (temp == null) {
            head = new1;
        } else {
            if (pos == 0) {
                new1.next = head;
                head = new1;
            } else {
                while (pos > 1) {
                    temp = temp.next;
                    temp1 = temp1.next;
                    pos--;
                }
                temp.next = new1;
                new1.next = temp1;
            }
        }
        return head;
    }

    public int CountLinkedlist(Node1 head) {
        int r = 1;
        if (head == null) {
            return 0;
        } else {
            Node1 temp = head;
            while (temp.next != null) {
                r++;
                temp = temp.next;
            }
        }
        return r;
    }

    public Node1 insertAtAnyPos(Node1 head, int data, int pos) {
        pos--;
        Node1 new1 = new Node1(data);
        Node1 temp = head;
        Node1 temp1 = head.next;
        if (temp == null) {
            head = new1;
        } else {
            if (pos == 0) {
                new1.next = head;
                head = new1;
            } else if (pos == (head.CountLinkedlist(head) - 1)) {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new1;
            } else {
                while (pos > 1) {
                    temp = temp.next;
                    temp1 = temp1.next;
                    pos--;
                }
                temp.next = new1;
                new1.next = temp1;
            }
        }
        return head;
    }

    public Node1 deleteFirst(Node1 head) {
        Node1 temp = head;
        head = temp.next;
        temp = null;
        return head;
    }

    public Node1 deleteLast(Node1 head) {
        Node1 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.next = null;
        temp.next = null;
        return head;
    }

    public Node1 deleteSpe(Node1 head, int pos) {
        Node1 temp = head;
        Node1 temp1 = head.next;
        pos--;
        while (pos > 1) {
            temp = temp.next;
            temp1 = temp1.next;
            pos--;
        }
        temp.next = temp1.next;
        temp1 = null;
        return head;
    }

    public Node1 deleteAny(Node1 head, int pos) {
        Node1 temp = head;
        Node1 temp1 = head.next;
        pos--;
        if (pos == 0) {
            head = temp1;
            temp = null;
        } else if (pos==(head.CountLinkedlist(head)-1)) {
            while (temp.next.next!=null) {
                temp = temp.next;
                temp1 = temp1.next;
            }
            temp.next=null;
            temp1 = null;
        } else {
            while (pos > 1) {
                temp = temp.next;
                temp1 = temp1.next;
                pos--;
            }
            temp.next = temp1.next;
            temp1 = null;
        }
        return head;
    }

    public static void main(String[] args) {

        Node1 n1 = new Node1(10);
        Node1 n2 = new Node1(20);
        Node1 n3 = new Node1(30);
        Node1 n4 = new Node1(40);

        Node1 head = n1;
        head.next = n2;
        head.next.next = n3;
        head.next.next.next = n4;

        System.out.println("Singly linkedlist");
        head.display(head);

        System.out.println("Singly linkedlist insert node at first position");
        head = head.insertAtFirstPos(head, 5);
        head.display(head);

        System.out.println("Singly linkedlist insert node at Last position");
        head = head.insertAtLastPos(head, 50);
        head.display(head);

        System.out.println("Singly linkedlist insert node at specific position");
        head = head.insertAtSpePos(head, 35, 5);
        head.display(head);

        System.out.println("number of data : " + head.CountLinkedlist(head));

        System.out.println("Singly linkedlist insert node at Any position(first any last)");
        head = head.insertAtSpePos(head, 2, 1);
        head.display(head);
        head = head.insertAtSpePos(head, 25, 5);
        head.display(head);
        head = head.insertAtSpePos(head, 60, 10);
        head.display(head);

        System.out.println("Singly linkedlist delete node of first position");
        head = head.deleteFirst(head);
        head.display(head);

        System.out.println("Singly linkedlist delete node at Last position");
        head = head.deleteLast(head);
        head.display(head);

        System.out.println("Singly linkedlist delete node at specific position");
        head = head.deleteSpe(head, 4);
        head.display(head);

        System.out.println("number of data : " + head.CountLinkedlist(head));

        System.out.println("Singly linkedlist delete node at Any position(first any last)");
        head = head.deleteAny(head, 1);
        head.display(head);
        head = head.deleteAny(head, 4);
        head.display(head);
        head = head.deleteAny(head, 5);
        head.display(head);

    }

}
