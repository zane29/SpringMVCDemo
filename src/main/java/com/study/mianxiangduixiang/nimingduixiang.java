package com.study.mianxiangduixiang;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/5/7.
 */


//形参是应用类的类型
 class nimingduixiang {
    public static void main(String[] args) {

       student1 student = new student1();
        student.show();
        demonidx demonidx = new demonidx();
        demonidx.show(new student1());//传的是类的引用类型

        nimingduixiang nimingduixiang = new nimingduixiang();
        nimingduixiang.asbnum();

    }


//    返回绝对值
    public  void  asbnum(){
        Scanner scanner= new Scanner(System.in);
        double num = scanner.nextDouble();

        System.out.println(Math.abs(num));
    }
}


class  student1{
    public  void show (){

        System.out.println("haohaoxuexi");
    }
}

class  demonidx{

    public  void  show (student1 ss){

        System.out.println("hhhhh");
    }



}
