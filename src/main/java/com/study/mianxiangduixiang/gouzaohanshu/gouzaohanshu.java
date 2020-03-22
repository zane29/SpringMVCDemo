package com.study.mianxiangduixiang.gouzaohanshu;

/**
 * Created by Administrator on 2016/5/7.
 */
public class gouzaohanshu {
    public static void main(String[] args) {

        Demo demo1 = new Demo();
        Demo demo2 = new Demo(1);
        Demo demo3 = new Demo("d","ds");

    }
}

class Demo {

    public Demo() {

        System.out.println("我是无参构造方法");

    }

    public Demo(int a){

        System.out.println("我是带一个参的构造方法");
    }

    public  Demo(String a ,String b ) {
        System.out.println("我是带两个个参的构造方法");


    }
}
