package com.wgy.datastructure.stack_queue;

/**
 * Created by wanggy on 2021/6/21.
 *
 * @author wanggy
 */
public class StackApp {

    public static void main(String[] args) {
        StackX stack = new StackX(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        while(!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value);
            System.out.print("  ");
        }
        System.out.println();
    }
}
