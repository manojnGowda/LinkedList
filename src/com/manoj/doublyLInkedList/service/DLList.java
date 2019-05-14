package com.manoj.doublyLInkedList.service;

import com.manoj.doublyLInkedList.Dto.DLNode;
import com.manoj.linkedList.Dto.Node;

public class DLList<T> {


    private DLNode<T> head;

    private int size;

    public void insertFront(T data){
        DLNode newNode = new DLNode(data);
        if ( head!=null ){
            newNode.setNext(head);
            head.setPrev(newNode);
        }
        head=newNode;
        size+=1;
    }

    public void insertEnd(T data){
        DLNode newNode = new DLNode(data);
        if ( head==null ){
            head=newNode;
        }else {
         DLNode temp = head;
         while (temp.getNext()!=null){
             temp=temp.getNext();
         }
         temp.setNext(newNode);
         newNode.setPrev(temp);
        }
        size+=1;
    }

    public void traverse(){
        if(head==null){
            System.out.println("List is empty unable to traverse");
        }else {
            DLNode temp = head;
            System.out.println("=====================");
            while (temp!=null){
                System.out.print(temp.getData()+"\t");
                temp =temp.getNext();
            }
            System.out.println("\n=====================");
        }
    }

    public void deleteFront(){
        if(head==null){
            System.out.println("List is empty unable to remove the data");
        }else {
            DLNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            if(head!=null){
                head.setPrev(null);
            }
            size-=1;
        }
    }

    public void deleteEnd(){
        if ( head==null ){
            System.out.println("List is empty unable to remove the data");
        }else {
            DLNode tail = head;
            if(size==1){
                head=null;
            }else {
                while (tail.getNext() != null) {
                    tail = tail.getNext();
                }
                DLNode<T> prev =tail.getPrev();
                tail.setPrev(null);
                prev.setNext(null);
            }
            size-=1;
        }
    }

    public void deleteData(T data){
        if(head==null){
            System.out.println("List is empty unable to remove the data");
        }else {
            DLNode temp = head;
            if ( head.getData().equals(data) ){
                head = head.getNext();
                temp.setNext(null);
                if(head!=null) {
                    head.setPrev(null);
                }
                size-=1;
            }else {
                while (temp!=null){
                    if(!temp.getData().equals(data)){
                        temp = temp.getNext();
                    }else{
                        size-=1;
                        DLNode prev = temp.getPrev();
                        DLNode next = temp.getNext();
                        temp.setNext(null);
                        temp.setPrev(null);
                        prev.setNext(next);
                        if(next!=null){
                            next.setPrev(prev);
                        }
                        break;
                    }
                }

            }
        }
    }

    public void deletePosition(int position){

        if ( position<0 || position>size-1 ){
            System.out.println("Invalid position");
            return;
        }
        if(head==null){
            System.out.println("List is empty unable to remove the passed position");
            return;
        }
        if(position==0){
            DLNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            System.out.println("delete the data "+temp.getData());
            if(head!=null) {
                head.setPrev(null);
            }
            size-=1;
        }else {
            DLNode temp =head;
            for(int i=1;i<position;i++){
                temp = temp.getNext();
            }

            DLNode delItem = temp.getNext();
            temp.setNext(temp.getNext().getNext());
            if(delItem.getNext()!=null){
                delItem.getNext().setPrev(temp);
            }
            delItem.setPrev(null);
            delItem.setNext(null);
            System.out.println("delete the data "+delItem.getData());
            size-=1;
        }
    }

    public void insertPosition(int position,T data){
        DLNode newNode = new DLNode(data);
        if ( position<0 ){
            position =0;
        }
        if(position>size){
            position = size;
        }

        if(head==null){
            head = newNode;
        }else if(position==0){
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }else {
            DLNode temp = head;
            for(int i=1;i<position;i++){
                temp = temp.getNext();
            }
            DLNode next =temp.getNext();
            temp.setNext(newNode);
            newNode.setPrev(temp);
            newNode.setNext(next);
            if(next!=null){
                next.setPrev(newNode);
            }
        }
        size+=1;
    }
}
