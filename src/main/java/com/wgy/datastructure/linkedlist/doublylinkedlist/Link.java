package com.wgy.datastructure.linkedlist.doublylinkedlist;

/**
 * Created by wanggy on 2021/6/23.
 *
 * @author wanggy
 */
public class Link {

    public long dData;
    public Link next;
    public Link previous;

    public Link(long d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
