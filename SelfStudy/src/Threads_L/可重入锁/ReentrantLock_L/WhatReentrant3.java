package Threads_L.可重入锁.ReentrantLock_L;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/*
使用ReentrantLock的注意点
ReentrantLock 和 synchronized 不一样，需要手动释放锁；
所以使用 ReentrantLock的时候一定要手动释放锁，并且加锁次数和释放次数要一样
*/

// 以下代码演示，加锁和释放次数不一样导致的死锁
public class WhatReentrant3 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(() -> {
            try {
                lock.lock();
                System.out.println("第1次获取锁，这个锁是：" + lock);

                int index = 1;
                while (true) {
                    try {
                        lock.lock();
                        System.out.println("第" + (++index) + "次获取锁，这个锁是：" + lock);

                        try {
                            Thread.sleep(new Random().nextInt(200));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (index == 10) {
                            break;
                        }
                    } finally {
//							lock.unlock();// 这里故意注释，实现加锁次数和释放次数不一样
                    }

                }

            } finally {
                lock.unlock();
            }
        }).start();


        new Thread(() -> {
            try {
                lock.lock();

                for (int i = 0; i < 20; i++) {
                    System.out.println("threadName:" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(new Random().nextInt(200));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                lock.unlock();
            }
        }).start();

        

    }
}

