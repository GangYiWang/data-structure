package com.wgy.datastructure.linkedlist.doublylinkedlist;

/**
 * Created by wanggy on 2021/6/23.
 *  双向列表
 * @author wanggy
 */
public class DoublyLinkedList {

    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long d) {
        Link newLink = new Link(d);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
            newLink.next = first;
        }
        first = newLink;
    }

    public void insertLast(long d) {
        Link newLink = new Link(d);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public void displayForward() {
        System.out.println("List (first-->last): ");
    }
}
