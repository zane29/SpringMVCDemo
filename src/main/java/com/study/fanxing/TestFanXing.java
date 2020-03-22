package com.study.fanxing;

/**
 * Created by Administrator on 2016/12/11.
 */
public class TestFanXing {
    public static void main(String[] args) {
        Test test = new Test();
        test.setA(1);
        test.setB(2);
        System.out.println(test.getA()+"\t"+test.getB()+"\t"+test.getC());
        Test<Integer,String> test1 = new Test<Integer,String>();
        test.setA("是否收到过");
        test.setB("是否收到过");
        test.setC("是否收到过");
//        System.out.println(test.getA()+"\t"+test.getB()+"\t"+test.getC());
        test.printTest();



    }

}

class Test<T1,T2>{
    T1 a;
    T2 b;
    String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public T1 getA() {
        return a;
    }

    public void setA(T1 a) {
        this.a = a;
    }

    public T2 getB() {
        return b;
    }

    public void setB(T2 b) {
        this.b = b;
    }
    public <T1,T2>void printTest(){
//    public <T1,T2>void printTest(T1 t1,T2 t2 ){
//        T1 m = t1;
//        T2 n = t2;
        System.out.println("=="+a+"\t"+b+"\t"+c+"\t");
    }
}
