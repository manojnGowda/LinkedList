package com.manoj.doublyLInkedList;

import com.manoj.doublyLInkedList.Dto.DLNode;
import com.manoj.doublyLInkedList.service.DLList;

public class DLLTester {
    public static void main(String[] args) {
        DLList<Integer> list = new DLList();
        list.insertFront(30);
        list.insertFront(20);
        list.insertPosition(2,25);
        list.traverse();
        /*list.insertFront(10);
        list.insertEnd(40);
        list.insertEnd(50);
        list.deleteEnd();*/
       // list.deletePosition(1);

        list.traverse();
    }
}
