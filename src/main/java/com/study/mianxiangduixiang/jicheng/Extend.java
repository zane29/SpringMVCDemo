package com.study.mianxiangduixiang.jicheng;

/**
 * Created by Administrator on 2016/5/11.
 */
public class Extend  {


    public  void show (){

        System.out.println(986);
    }
    public static void main(String[] args) {
     fu  fu = new zi();

        fu.show();          //输出zi
        System.out.println(fu.a);   //输出fu

        zi zi =new zi();
        zi.show();                          //输出zi
        System.out.println(zi.a);           //输出zi


    }

}

class  fu {
    String a ="fu";

    public void show() {

        System.out.println(9876);



    }
}

class  zi extends fu {
    String a ="zi";

    public  void  show() {

        System.out.println("zi");


    }
}
