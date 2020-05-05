package com.yinxin.threadSafe;

public class SynchronizedMethodThread implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            this.payTicket();
        }

    }

    private synchronized void payTicket() {
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