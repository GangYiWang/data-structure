package com.wgy.datastructure.linkedlist.firstlastlist;

/**
 * Created by wanggy on 2021/6/22.
 *
 * @author wanggy
 */
public class FirstLastList {

    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dData) {
        Link link = new Link(dData);
        if (isEmpty()) {
            last = link;
        }
        link.next = first;
        first = link;
    }

    public void insertLast(long dData) {
        Link link = new Link(dData);
        if (isEmpty()) {
            first = link;
        } else {
            last.next = link;
        }
        last = link;

    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return temp;
    }

    public void displayList() {
        System.out.println("List (first-->last): ");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
