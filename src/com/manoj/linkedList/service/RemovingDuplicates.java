package com.manoj.linkedList.service;

import com.manoj.linkedList.Dto.Node;

import java.util.HashSet;

public class RemovingDuplicates {


    /**
     * Here the extra space is used so that linked list takes n time and n space
     *
     * @param list
     */
    public void removingDuplicatesUsingHashSet(LinkedList<Integer> list){

        HashSet<Integer> uniqueValueBucket = new HashSet<>();

        Node<Integer> cur = list.getHead();
        Node prev = null;

        while(cur!=null){
            if(uniqueValueBucket.contains(cur.getData())){
                prev.setNext(cur.getNext());
                cur = cur.getNext();
            }else {
                uniqueValueBucket.add(cur.getData());
                prev = cur;
                cur = cur.getNext();
            }
        }
    }


    public void removingDuplicatesWithOutSpace(LinkedList<Integer> list){

        Node<Integer> cur = list.getHead();
        while (cur!=null){
            Node<Integer> temp = cur.getNext();
            Node<Integer> prev = cur;
            while(temp!=null){
                if(temp.getData()==cur.getData()){
                    prev.setNext(temp.getNext());
                    temp = temp.getNext();
                }else{
                    prev = prev.getNext();
                    temp= temp.getNext();
                }
            }
            cur = cur.getNext();
        }
    }

    public void removingDuplicatesWithOutSpaceRecurrsive(Node<Integer>head){

        if(head != null){
            Node<Integer> temp = head.getNext();
            Node<Integer> prev = head;

            while(temp!=null){
                if(temp.getData().equals(head.getData())){
                    prev.setNext(temp.getNext());
                    temp = temp.getNext();
                }else{
                    prev = prev.getNext();
                    temp= temp.getNext();
                }
            }
            removingDuplicatesWithOutSpaceRecurrsive(head.getNext());
        }
    }
}
