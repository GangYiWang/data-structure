package com.wgy.datastructure.stack_queue;

/**
 * Created by wanggy on 2021/6/21.
 *
 * @author wanggy
 */
public class QueueApp {

    public static void main(String[] args) {
        QueueX queue = new QueueX(5);
        queue.display();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.display();

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        queue.display();

        while(!queue.isEmpty()) {
            long n = queue.remove();
            System.out.print(n);
            System.out.print("  ");
        }
        System.out.println();
    }
}
