package com.yinxin.threadSafe;

public class Main {
    public static void main(String[] args) {
        // soleTicket(new UnsafeThread());// 线程不安全
        // soleTicket(new SynchronizedThread());// 线程安全
        // soleTicket(new SynchronizedMethodThread());// 线程安全
        soleTicket(new LockThread());// 线程安全
    }

    // 开启多线程的买票任务
    private static void soleTicket(Runnable rn) {
        for (int i = 0; i < 3; i++) {
            new Thread(rn).start();

        }
    }
}