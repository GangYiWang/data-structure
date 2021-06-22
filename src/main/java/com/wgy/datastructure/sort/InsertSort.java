package com.wgy.datastructure.sort;

import java.util.Random;

/**
 * Created by wanggy on 2021/6/21.
 *
 * @author wanggy
 */
public class InsertSort {

    public static void insertSort(int[] nums) {
        int j, temp;
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i];
            j = i;
            while(j > 0 && nums[j - 1] >= temp) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[10000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10000);
        }
        long start = System.currentTimeMillis();
        InsertSort.insertSort(nums);
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start)/1000.0);
        System.out.println(nums);
    }
}
