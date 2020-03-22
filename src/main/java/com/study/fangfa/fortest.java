package com.study.fangfa;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/5/2.
 *
 *
 */
public class fortest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("输入第一个数");
        int a = scanner.nextInt();
        System.out.println("输入第二个数");
        int b = scanner.nextInt();
        System.out.println("输入第三个数");
        int c = scanner.nextInt();
        int h =new fortest().getMax(a,b,c) ;

        System.out.println(c);

    }

     /*
     * 输入两个数输出最大的值
     * */
    private int  getMax( int i , int j ,int x){

        int f =(i>j?(i>x?i:x):j);
        return f;


    }
}
