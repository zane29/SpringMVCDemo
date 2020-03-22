package com.study.duanxiancheng;

/**
 * Created by Administrator on 2016/9/11.
 */
public class MyRunDemo {
    public static void main(String[] args) {

        MyRun myRun = new MyRun();
        MyRun myRun1 = new MyRun();
        MyRun myRun2 = new MyRun();
        MyRun myRun3 = new MyRun();
        new Thread(myRun).start();
        new Thread(myRun1).start();
        new Thread(myRun2).start();
        new Thread(myRun3).start();




    }
}
