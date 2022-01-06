package com.masterclass.LinkList;

import org.w3c.dom.Node;

public class LinkList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){this.data = d; next = null;}
    }
    /* Inserts a new Node at front of the list. */
    public void insertAtBeginning(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }
    /* Inserts a new Node after a node. */
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    /* append new node */
    public void append(int new_data){
        Node newNode = new Node(new_data);
        if(head == null){
            head = new Node(new_data);
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
        return;

    }



    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertAtBeginning(1);

    }


}
