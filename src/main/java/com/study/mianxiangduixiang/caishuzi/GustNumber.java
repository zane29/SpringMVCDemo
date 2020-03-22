package com.study.mianxiangduixiang.caishuzi;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/5/8.
 */
public class GustNumber {


    public static void main(String[] args) {

        System.out.println("随机产生一个随机数");
        int number= (int) (Math.random()*100)+1;
        System.out.println("输入1-100的数");
        Scanner sc = new Scanner(System.in);
        while (true){
            int gustnumber = sc.nextInt();
            if (number==gustnumber){
                System.out.println("你猜中了");
                break;

            }else if (number>gustnumber){
                System.out.println("你猜小了");
            }else {
                System.out.println("你猜大了");
            }

        }

    }
}
