package com.manoj.linkedList.service;

import com.manoj.linkedList.Dto.Node;

public class LinkedListService<T> {

    private Node<T> head;

    private int size;

    void insertBeginning(T data){

        Node newNode = new Node(data);
        size++;

        if(head!=null){
            newNode.setNext(head);
        }
        head=newNode;
    }

    void insertEnd(T data){

        Node newNode = new Node(data);
        size++;

        if(head==null){
            head=newNode;
        }else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }
}
