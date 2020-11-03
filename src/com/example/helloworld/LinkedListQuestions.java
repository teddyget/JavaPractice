package com.example.helloworld;

import com.example.helloworld.HelloWorld.Node;

public class LinkedListQuestions {
    public static Node reverseLinkedList(Node node){
        Node prev = null;
        Node curr = node;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node nthElementFromLast(Node head, int n){
        Node left = head;
        Node right = head;

        //First, make sure that we have at least n items in the lined list
        for (int i = 0; i < n; i++){
            if(right == null)return null;
            right = right.next;
        }
        while(right != null){
            right = right.next;
            left = left.next;
        }
        return left;
    }

}
