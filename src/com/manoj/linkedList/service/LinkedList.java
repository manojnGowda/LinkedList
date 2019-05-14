package com.manoj.linkedList.service;

import com.manoj.linkedList.Dto.Node;

public class LinkedList<T> {

    private Node<T> head;

    private int size;

    public Node<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

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
            System.out.println("List is empty unable to print the data");
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

    public void insertAtPosition(T data,int position){

       Node newNode = new Node(data);
       if(position<0){
           position=0;
       }else if(position>size){
           position = size;
       }
       if(head == null){
           head = newNode;
       }else if(position==0){
           newNode.setNext(head);
           head = newNode;
       }else {
           Node temp = head;
           for(int i=1;i<position;i++){
               temp = temp.getNext();
           }
           newNode.setNext(temp.getNext());
           temp.setNext(newNode);
       }
        size += 1;
    }

    public T deleteAtPosition(int position){
       if(position<0){
           position=0;
       }else if(position>=size){
           position=size-1;
       }

       if(head==null){
           System.out.println("List is empty");
           return null;
       }else if(position==0){
           Node<T> temp = head;
           head=head.getNext();
           size-=1;
           System.out.println("Deleted the data: "+temp.getData()+" at the position "+position);
           return temp.getData();
       }else {
           Node<T> temp = head;
           for(int i=1;i<position;i++){
               temp = temp.getNext();
           }
           T data = temp.getNext().getData();
           temp.setNext(temp.getNext().getNext());
           size-=1;
           System.out.println("Deleted the data: "+data+" at the position "+position);
           return data;
       }
    }

    public void deleteMatched(T data){
       if(head==null){
           System.out.println("List is empty");
           return;
       }
       if(head.getData().equals(data)){
           head = head.getNext();
           size-=1;
       }else{
           Node cur =head;
           Node prev= null;
           while (cur!=null){
               if(cur.getData().equals(data)){
                  prev.setNext(cur.getNext());
                   cur.setNext(null);
                  size-=1;
                  return;
               }else {
                   prev = cur;
                   cur = cur.getNext();
               }
           }
       }
    }

    public void reverseTraversal(){
       if(head==null){
           System.out.println("List is empty unable to traverse");
       }else {
           System.out.println("print the list in the reverse order");
           reverse(head);
       }

    }

    private void reverse( Node<T> cur) {
       if(cur==null){
           return;
       }else {
           reverse(cur.getNext());
           System.out.print(cur.getData()+"\t");
       }
    }

    public void reverseListIterative(){
        if(head!=null){
            Node current = head;
            Node prev = null;
            while (current!=null){
                Node next = current.getNext();
                current.setNext(prev);
                prev = current;
                current = next;
            }
            head = prev;
        }
    }

    public Node<T> reverseListRecusrsive(Node current,Node prev){
        if(current.getNext()==null){
            current.setNext(prev);
            head = current;
            return head;
        }else {
            Node next = current.getNext();
            current.setNext(prev);
            reverseListRecusrsive(next,current);
            return head;

        }
    }
}
