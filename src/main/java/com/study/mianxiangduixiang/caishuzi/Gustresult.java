package com.study.mianxiangduixiang.caishuzi;

/**
 * Created by Administrator on 2016/5/8.
 */

public class Gustresult {
    int apple;
    static {

        System.out.println(
              "我是静态方法体"
        );
    }
    public static void main(String[] args) {

        StudentDemo studentDemo =  new StudentDemo();
        StudentDemo studentDemo1  = new StudentDemo();



    }

    public  void  a (){

        int apple;
    }
}

class StudentDemo{
    static {


        System.out.println("我静态代码块，在类第一次加载的时候是执行");
    }


    {
        System.out.println("这是代码块，在对象初始化时执行");

    }

    public  StudentDemo(){
        System.out.println("这个是无参构造方法");



    }
}
