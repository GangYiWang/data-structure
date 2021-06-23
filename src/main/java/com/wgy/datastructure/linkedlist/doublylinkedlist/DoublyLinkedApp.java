package com.wgy.datastructure.linkedlist.doublylinkedlist;

import com.wgy.datastructure.linkedlist.doublylinkedlist.DoublyLinkedList;

/**
 * Created by wanggy on 2021/6/23.
 *
 * @author wanggy
 */
public class DoublyLinkedApp {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);
    }
}
