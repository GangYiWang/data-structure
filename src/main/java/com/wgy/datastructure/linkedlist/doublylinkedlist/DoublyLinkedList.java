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

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long d) {
        Link current = first;
        while(current.dData != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        Link newLink = new Link(d);

        if (current == last) {
            last = newLink;
        } else {
            current.next.previous = newLink;
        }
        newLink.next = current.next;
        current.next = newLink;
        newLink.previous = current;

        return true;
    }

    public Link deleteKey(long key) {
        Link current = first;
        while(current.dData != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;

    }

    public void displayForward() {
        System.out.println("List (first-->last): ");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.println("List (last-->first): ");
        Link current = last;
        while(current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
}
