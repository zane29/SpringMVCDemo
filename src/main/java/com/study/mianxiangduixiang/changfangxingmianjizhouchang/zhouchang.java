package com.study.mianxiangduixiang.changfangxingmianjizhouchang;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/5/7.
 */
public class zhouchang {

    private  int a;
    private  int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     * @param
     *
     *
     * */

    public int zc(){
        System.out.println("周长ghjf");
        return  (a+b)*2;
    }

    public int mj(){
        System.out.println("面积sdfaf98");
        return  a*b;
    }

}


class main {


    public static void main(String[] args) throws InterruptedException {
        zhouchang zhouchang = new zhouchang();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入长");
        zhouchang.setA(scanner.nextInt());
        System.out.println("输入宽");
        zhouchang.setB(scanner.nextInt());
        int zc =zhouchang.zc();
        int mj=zhouchang.mj();

        System.out.println(zc);
        Thread.sleep(3000);
        System.out.println(mj);

    }
}
