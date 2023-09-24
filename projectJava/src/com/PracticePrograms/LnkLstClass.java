package com.PracticePrograms;

public class LnkLstClass {
    Node head;
    void LnkLstClass()
    {
        head = null;
    }
    void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    void addNode(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void reverseList()
    {
        Node current = head;
        Node temp = null;
        Node prev = null;

        while (current.next != null)
        {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        current.next = prev;
        head = current;

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


