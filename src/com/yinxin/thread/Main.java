package com.yinxin.thread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        ThreadGetName threadGetName = new ThreadGetName();
        threadGetName.start();
        // 第二种实现多线程的方式
        new Thread(new MyThread2()).start();
        // 第三种 使用匿名内部类实现多线程
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("第三种方式===>" + i);
                    delay();
                }
            }
        }.start();
        // 第三种方式使用接口方式实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println("第三种方式使用接口方式实现=>" + i);
                    delay();
                }
            }
        }).start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("main==>" + i);
            delay();
        }
    }

    private static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}