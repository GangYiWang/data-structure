package com.wgy.datastructure.linkedlist.linklist;

/**
 * Created by wanggy on 2021/6/22.
 *
 * @author wanggy
 */
public class LinkList2App {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.insertFirst(22, 2.99);
        linkList.insertFirst(44, 4.99);
        linkList.insertFirst(66, 6.99);
        linkList.insertFirst(88, 8.99);

        linkList.displayList();

        Link f = linkList.find(44);
        if (f != null) {
            System.out.println("Found link with key " + f.iData);
        } else {
            System.out.println("Can't find link");
        }

        Link d = linkList.delete(66);
        if (d != null) {
            System.out.println("Deleted link with key " + d.iData);
        } else {
            System.out.println("Can't delete link");
        }

        linkList.displayList();
    }
}
