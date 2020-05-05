package com.yinxin.threadSafe;

public class UnsafeThread implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0)
                return;
            System.out.println("第" + ticket + "张票");
            ticket--;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}