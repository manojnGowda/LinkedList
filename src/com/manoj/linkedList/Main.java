package com.manoj.linkedList;

import com.manoj.linkedList.Dto.Node;
import com.manoj.linkedList.service.LinkedList;
import com.manoj.linkedList.service.LinkedListUtils;
import com.manoj.linkedList.service.RemovingDuplicates;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList();
        LinkedList<Integer> linkedList2 = new LinkedList();
        /*linkedList.insertBeginning(70);
        linkedList.insertBeginning(60);
        linkedList.insertBeginning(50);
        linkedList.insertBeginning(40);
        linkedList.insertBeginning(30);
        linkedList.insertBeginning(20);
        linkedList.insertBeginning(10);
        linkedList.traverse();
        Integer data =  LinkedListUtils.findNthFromLast(linkedList.getHead(),4);
        Integer data2 =  LinkedListUtils.findNthFromLastOption2(linkedList.getHead(),4,linkedList.getSize());
        Integer data3 =  LinkedListUtils.findNthFromLastRecursion(linkedList.getHead(),4);
        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);
        linkedList.traverse();*/

        //
        /*linkedList.insertEnd(1);
        linkedList.insertEnd(3);
        linkedList.insertEnd(5);
        linkedList.insertEnd(7);
        linkedList.insertEnd(9);


        linkedList2.insertEnd(2);
        linkedList2.insertEnd(4);
        linkedList2.insertEnd(6);
        linkedList2.insertEnd(8);
        linkedList2.insertEnd(10);
        Node head =  LinkedListUtils.mergerSortedListRecursive(linkedList.getHead(),linkedList2.getHead());
        LinkedListUtils.traverseByHead(head);*/
        //linkedList.getHead().getNext().getNext().getNext().setNext(linkedList.getHead());
        /*System.out.println(LinkedListUtils.detectLoop(linkedList.getHead()));
        System.out.println(LinkedListUtils.detectLoopIterative(linkedList.getHead()));*/

        //linkedList.traverse();
        //System.out.println(LinkedListUtils.isEvenList(linkedList.getHead()));
        //linkedList.reverseListIterative();
        //linkedList.reverseListRecusrsive(linkedList.getHead(),null);

        //linkedList.traverse();

        LinkedList<Integer> linkedListStr = new LinkedList();
        linkedListStr.insertEnd(1);
        linkedListStr.insertEnd(2);
        linkedListStr.insertEnd(3);
        linkedListStr.insertEnd(4);
        linkedListStr.insertEnd(3);
        linkedListStr.insertEnd(2);
        linkedListStr.insertEnd(1);
        //System.out.println(LinkedListUtils.isPalindrome(linkedListStr.getHead()));
        linkedListStr.traverse();
        new RemovingDuplicates().removingDuplicatesWithOutSpaceRecurrsive(linkedListStr.getHead());
        linkedListStr.traverse();


    }
}
