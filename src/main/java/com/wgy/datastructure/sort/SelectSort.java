package com.wgy.datastructure.sort;

import java.util.Random;

/**
 * Created by wanggy on 2021/6/21.
 *
 * @author wanggy
 */
public class SelectSort {

    public static void selectSort(int[] nums) {
        int min;
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[10000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10000);
        }
        long start = System.currentTimeMillis();
        SelectSort.selectSort(nums);
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start)/1000.0);
        System.out.println(nums);
    }
}
