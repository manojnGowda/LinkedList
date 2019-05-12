package com.manoj;

import com.manoj.linkedList.service.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.traverse();
        linkedList.insertBeginning(40);
        linkedList.insertBeginning(30);
        linkedList.insertBeginning(20);
        linkedList.insertBeginning(10);
        linkedList.insertEnd(50);
        linkedList.traverse();
        linkedList.deleteBeginning();
        linkedList.traverse();
        linkedList.deletelast();
        linkedList.deletelast();
        linkedList.deletelast();
        linkedList.deletelast();
        linkedList.deletelast();


    }
}
