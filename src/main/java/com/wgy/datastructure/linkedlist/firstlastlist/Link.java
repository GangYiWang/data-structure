package com.wgy.datastructure.linkedlist.firstlastlist;

/**
 * Created by wanggy on 2021/6/22.
 *
 * @author wanggy
 */
public class Link {

    public long dData;
    public Link next;

    public Link(long dData) {
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
