package com.wgy.datastructure.linkedlist.sortedlist;

/**
 * Created by wanggy on 2021/6/23.
 *
 * @author wanggy
 */
public class SortedListApp {

    public static void main(String[] args) {
        SortedList list = new SortedList();
        list.insert(20);
        list.insert(40);

        list.displayList();

        list.insert(10);
        list.insert(30);
        list.insert(50);

        list.displayList();

        list.remove();

        list.displayList();;
    }
}
