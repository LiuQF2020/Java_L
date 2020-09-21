package Threads_L.可重入锁.ReentrantLock_L;

//https://blog.csdn.net/w8y56f/article/details/89554060

// 使用synchronized演示可重入锁是什么意思，可重入，就是可以重复获取相同的锁；
// synchronized和ReentrantLock都是可重入的
// 可重入降低了编程复杂性
public class WhatReentrant {
    public static void main(String[] args) {

        Object obj = new Object();
        new Thread(() -> {

        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println("第1次获取锁，这个锁是：" + this);
                    int index = 1;
                    do {
                        synchronized (this) {
                            System.out.println("第" + (++index) + "次获取锁，这个锁是：" + this);
                        }
                    } while (index != 10);
                }
            }
        }).start();
    }
}
