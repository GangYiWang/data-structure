package com.wgy.datastructure.sort;

import java.util.Random;

/**
 * Created by wanggy on 2021/6/21.
 *
 * @author wanggy
 */
public class BubbleSort {

    public static void bubbleSort1(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] nums) {
        int temp;
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[10000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10000);
        }
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort2(nums);
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start)/1000.0);
        System.out.println(nums);
    }
}
