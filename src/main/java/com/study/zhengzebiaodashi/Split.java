package com.study.zhengzebiaodashi;

/**
 * Created by Administrator on 2016/8/13.
 */
public class Split {
    public static void main(String[] args) {

        String str = "78 78 9 67 67 7 9 "  ;
        String [] a =str.split("\\s");
        for(String b:a){
            System.out.println(b);
        }


//        String str2 =str.replaceAll("\\d","*");
//        System.out.println(str2);
    }


}
