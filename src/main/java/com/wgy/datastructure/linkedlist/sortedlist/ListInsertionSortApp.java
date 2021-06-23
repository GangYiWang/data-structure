package com.wgy.datastructure.linkedlist.sortedlist;

/**
 * Created by wanggy on 2021/6/23.
 *
 * @author wanggy
 */
public class ListInsertionSortApp {

    public static void main(String[] args) {
        int size = 10;

        Link[] linkArray = new Link[size];

        for (int i = 0; i < size; i++) {
            long dData = (long) (Math.random() * 99);
            Link newLink = new Link(dData);
            linkArray[i] = newLink;
        }

        System.out.println("Unsorted array: ");
        for (Link k : linkArray) {
            System.out.print(k.dData + " ");
        }
        System.out.println();

        SortedList sortedList = new SortedList(linkArray);
        for (int i = 0; i < size; i++) {
            linkArray[i] = sortedList.remove();
        }

        System.out.println("Sorted array: ");
        for (Link k : linkArray) {
            System.out.print(k.dData + " ");
        }
        System.out.println();
    }
}
