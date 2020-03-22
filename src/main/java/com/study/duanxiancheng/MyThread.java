package com.study.duanxiancheng;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/10.
 */

public class MyThread extends Thread{
    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized(this){
            for (int i =0;i<200;i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i +"\t"+new Date());

                Thread.yield();

                //线程休眠
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            }

        }

    }
}
