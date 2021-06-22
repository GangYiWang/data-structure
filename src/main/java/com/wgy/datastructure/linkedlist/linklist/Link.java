package com.wgy.datastructure.linkedlist.linklist;

/**
 * Created by wanggy on 2021/6/22.
 *
 * @author wanggy
 */
public class Link {

    public int iData;
    public double dData;
    public Link next;

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "}");
    }
}
