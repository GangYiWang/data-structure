package com.wgy.datastructure.advanced_sort.shell_sort;

/**
 * Created by wanggy on 2021/6/29.
 *
 * @author wanggy
 */
public class ShellSortApp {

    public static void main(String[] args) {
        int maxSize = 10;
        ArrayShell array;
        array = new ArrayShell(maxSize);

        for (int j = 0; j < maxSize; j++) {
            long n = (long) (Math.random() * 99);
            array.insert(n);
        }
        array.display();
        array.shellSort();
        array.display();
    }
}
