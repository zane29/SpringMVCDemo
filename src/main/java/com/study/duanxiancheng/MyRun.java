package com.study.duanxiancheng;

/**
 * Created by Administrator on 2016/9/11.
 */
  public class MyRun implements Runnable {

    @Override
    public void run() {

        for (int i = 0 ;i<200; i++) {
            System.out.println(Thread.currentThread().getName()+"\t+"+i);
        }

    }
}
