package com.study.duanxiancheng;

/**
 * Created by Administrator on 2016/9/8.
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread myThread1= new MyThread("我是线程1");
        MyThread myThread2= new MyThread("我是线程2");
        MyThread myThread3= new MyThread("我是线程3");
        MyThread myThread4= new MyThread("我是线程4");
//        myThread1.setPriority(2);
//        myThread2.setPriority(1);

        myThread1.start();
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2.start();
        myThread3.start();
        myThread4.start();
    }
}
