package com.study.jiekou;

/**
 * Created by Administrator on 2016/8/14.
 */
public class Test {
    public static void main(String[] args) {
//        Chinese p = new Chinese();
//        American p2= new American();
        APerson p = new Chinese();
        APerson p2 = new American();
        p.say();
        p2.say();
    }
}
