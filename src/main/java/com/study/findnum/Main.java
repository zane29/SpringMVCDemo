package com.study.findnum;

public class Main {

    public static void main(String[] args) {
//        int a = 8;
//        int b = 4;
//        int c = a++;
//        int d = b--;

//        int h;
//        a /= b;

//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(a);
//        String str01 = "aaaannnbmmkdjgkljdoinnjg";
        /*
        *   查找0-9999里面有多少个7
        * */
        int nNum=0;
        for (int j =0  ; j<=9999;j++){
            String str =String.valueOf(j);
            for (int i = 0; i < str.length(); i++) {
                String num = String.valueOf(str.charAt(i));
                if(num.equals("7")){
                    ++nNum;
                }
            }

        }
        System.out.println(nNum);


    }
}
