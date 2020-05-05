package com.yinxin.thread;

public class ThreadGetName extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("currentThread===>" + Thread.currentThread());
        }
    }
}