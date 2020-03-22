package com.study.mianxiangduixiang;

/**
 * Created by Administrator on 2016/5/7.
 */
 class student {

    public  void  show (Demo demo) {
        demo.show();


    }
}

class Demo {
    public void show(){
        System.out.println("hello world!");
    }
}

class Test{

    public static void main(String[] args) {

        Demo demo = new Demo();
//        int result = demo.show(45,45);
//        System.out.println(result);

        student  student = new student();
        student.show(demo);


    }
}
