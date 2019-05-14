package com.manoj.linkedList.service;

import com.manoj.linkedList.Dto.Node;

import java.util.HashSet;

public class LinkedListUtils<T> {

    /**
     * Option 1
     * Program for n’th node from the end of a Linked List
     *
     */

    public static <T> T findNthFromLast(Node head,int n){
        Node<T> temp = head;
        int length = 0;
        while (temp!=null){
            temp = temp.getNext();
            length+=1;
        }
        if(length<n){
            return null;
        }
        temp = head;
        for (int i=1;i<length-n+1;i++){
            temp = temp.getNext();
        }
        return temp.getData();
    }


    /**
     * Option 2
     * Program for n’th node from the end of a Linked List
     *
     */

    public static <T> T findNthFromLastOption2(Node head,int n,int listSize){
        Node<T> temp1 = head;
        Node<T> temp2 = head;
        int count=1;
        if(n>listSize){
            return null;
        }
        while (count<=n-1){
            temp1 = temp1.getNext();
            count++;
        }

        while (temp1.getNext()!=null){
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }

        return temp2.getData();
    }

    /**
     * Option 3
     * Program for n’th node from the end of a Linked List Recursion
     *
     */

    static int counter = 0;
    public static <T> T findNthFromLastRecursion(Node<T> head,int n){
      if(head==null){
          return null;
      }else {
          T value = findNthFromLastRecursion(head.getNext(),n);
          if(value==null) {
              counter++;
              if ( counter == n ) {
                  return head.getData();
              }
          }else {
              return value;
          }
      }
      return null;
    }

    /**
     *
     * Floyd’s Cycle-Finding Algorithm: to detect the loop in the linked list
     *
     * @param head
     * @param <T>
     * @return
     */

    public static <T> boolean detectLoop(Node<T> head){
        Node slow = head;
        Node fast = head;
        while (slow!=null && fast!=null && fast.getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow.equals(fast)){
                return true;
            }
        }
        return false;
    }

    /**
     *Detecting the loop in the linked list with the hashing value(Set)
     *
     * @param head
     * @param <T>
     * @return
     */
    public static <T> boolean detectLoopIterative(Node<T> head){
        HashSet<Node> dataSet = new HashSet<>();
        while (head!=null){
            if(dataSet.contains(head))
                return true;
            dataSet.add(head);
            head = head.getNext();
        }
        return false;
    }


}
