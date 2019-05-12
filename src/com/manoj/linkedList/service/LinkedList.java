package com.manoj.linkedList.service;

import com.manoj.linkedList.Dto.Node;

public class LinkedList<T> {

    private Node<T> head;

    private int size;

   public void insertBeginning(T data){

        Node newNode = new Node(data);
        size++;

        if(head!=null){
            newNode.setNext(head);
        }
        head=newNode;
    }

   public void insertEnd(T data){

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

   public void traverse(){
        if(head==null) {
            System.out.println("List is empty");
        }else {
            System.out.println("=====================");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.getData()+"\t");
                temp = temp.getNext();
            }
            System.out.println("\n=====================");
        }
    }

    public T deleteBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return  null;
        }else {
            Node<T> temp = head;
            head = head.getNext();
            size--;
            System.out.println("Successfully deleted the data from the beginning of the list: "+temp.getData());
            temp.setNext(null);
            return temp.getData();
        }
    }

    public T deletelast(){
        if(head==null){
            System.out.println("List is empty");
            return  null;
        }else {
            Node<T> cur = head;

                Node<T> prev = null;
                while (cur.getNext() != null) {
                    prev = cur;
                    cur = cur.getNext();
                } if(head.getNext()==null){
                    head=null;
                }else {
                prev.setNext(null);
            }

            size--;
            System.out.println("Successfully deleted the data from the end of the list: "+cur.getData());
            return cur.getData();
        }
    }
}
