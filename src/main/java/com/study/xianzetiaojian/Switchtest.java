package com.study.xianzetiaojian;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/5/1.
 */
public class Switchtest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a){
            case 8 :
                System.out.println("哈哈哈");
                break;
            case 7 :
                System.out.println("aaaaa");
                break;
            default:
                System.out.println("66666");
                break;
        }


    }
}
