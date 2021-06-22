package com.wgy.datastructure.linkedlist.linklist;

/**
 * Created by wanggy on 2021/6/22.
 *
 * @author wanggy
 */
public class LinkListApp {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.insertFirst(22, 2.99);
        linkList.insertFirst(44, 4.99);
        linkList.insertFirst(66, 6.99);
        linkList.insertFirst(88, 8.99);

        linkList.displayList();

        while(!linkList.isEmpty()) {
            Link link = linkList.deleteFirst();
            System.out.println("Deleted ");
            link.displayLink();
            System.out.println();
        }
        linkList.displayList();
    }
}
