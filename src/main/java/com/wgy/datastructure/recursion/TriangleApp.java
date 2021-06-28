package com.wgy.datastructure.recursion;

/**
 * Created by wanggy on 2021/6/28.
 *
 * @author wanggy
 */
public class TriangleApp {

    public static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + triangle(n - 1));
        }
    }

    public static void main(String[] args) {
        int n = 100;
        int answer = triangle(n);
        System.out.println("Triangle=" + answer);
    }
}
