package com.yinxin.threadSafe;

public class SynchronizedThread implements Runnable {
    int ticket = 100;
    Object key = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (key) { // 加入同步锁 以下代码块中则是线程安全的
                if (ticket <= 0)
                    return;
                System.out.println("第" + ticket + "张票");
                ticket--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}