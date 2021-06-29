package com.wgy.datastructure.advanced_sort.shell_sort;

/**
 * Created by wanggy on 2021/6/29.
 *  希尔排序
 * @author wanggy
 */
public class ArrayShell {

    private long[] array;
    private int total;

    public ArrayShell(int max) {
        array = new long[max];
        total = 0;
    }

    public void insert(long value) {
        array[total++] = value;
    }

    public void display() {
        System.out.print("A=");
        for(long e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /**
     * 希尔排序
     */
    public void shellSort() {
        int inner, outer;
        long temp;

        int h = 1;
        while(h <= total / 3) {
            h = 3 * h +1;
        }

        while(h > 0) {
            for (outer = h; outer < total; outer++) {
               temp = array[outer];
               inner = outer;

               while(inner > h - 1 && array[inner - h] >= temp) {
                   array[inner] = array[inner - h];
                   inner -= h;
               }
               array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
