package com.study.zhengzebiaodashi;

/**
 * Created by Administrator on 2016/8/13.
 */

import java.util.Scanner;

/**
 *
 * 判断手机号码
 * */
public class Regex {
    public static void main(String[] args) {

        while (1==1){
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入手机号码");
            String str = scanner.nextLine();
            //定义手机规则

            String regex= "1[38]\\d{9}";
            boolean glag= regex.matches(regex);
            if (glag){
                System.out.println("格式正确！");
            }else {
                System.out.println("格式错误！");

            }
            if (str.equals("end")){
                System.out.println("结束");
                return;
            }

        }


    }
}
