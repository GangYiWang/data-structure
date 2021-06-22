package com.wgy.datastructure.stack_queue;

/**
 * Created by wanggy on 2021/6/21.
 *
 * @author wanggy
 */
public class QueueX {

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueX(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = value;
        nItems++;
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

    public void display() {
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.println(queArray[i]);
            }
        } else {
            if (nItems != 0) {
                for (int i = front; i <= maxSize - 1; i++) {
                    System.out.println(queArray[i]);
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.println(queArray[i]);
                }
            }
        }
    }
}
