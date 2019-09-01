package com.campaign;

public class App {
    public boolean m0() throws InterruptedException {
        long l = System.currentTimeMillis();
        Thread.sleep(300000);
        System.out.println("Time taken M0:" + (System.currentTimeMillis() - l));
        return true;
    }

    public boolean m1() throws InterruptedException {
        long l = System.currentTimeMillis();
        Thread.sleep(300000);
        System.out.println("Time taken M1:" + (System.currentTimeMillis() - l));
        return true;
    }

    public boolean m2() throws InterruptedException {
        long l = System.currentTimeMillis();
        Thread.sleep(300000);
        System.out.println("Time taken M2:" + (System.currentTimeMillis() - l));
        return true;
    }

    public boolean m3() throws InterruptedException {
        long l = System.currentTimeMillis();
        Thread.sleep(300000);
        System.out.println("Time taken M3:" + (System.currentTimeMillis() - l));
        return true;
    }

    public boolean m4() throws InterruptedException {
        long l = System.currentTimeMillis();
        Thread.sleep(300000);
        System.out.println("Time taken M4:" + (System.currentTimeMillis() - l));
        return true;
    }
}
