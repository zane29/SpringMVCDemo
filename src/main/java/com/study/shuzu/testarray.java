package com.study.shuzu;

/**
 * Created by Administrator on 2016/5/2.
 */
public class testarray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3,4,5,6,7,8};

        int b[]=new int[8] ;
        System.arraycopy(a,0,b,4,4);

        int max=b[0];
        for (int i = 0 ;i<b.length;i++){
            System.out.println(b[i]);
            if(max<b[i]){
                max= b[i];
            }

        }

        System.out.println("max:"+max);

        int c[] = new int[3];
        c[2] = 99;
        System.out.println(c[2]);//输出数组的地址值

        testarray testarray= new testarray();
        testarray.reverseStr();

        testarray.reverseAarray(a);
    }
       //字符串翻转
    private  void reverseStr(){

        String str = "asdfg";

        System.out.println(new StringBuffer(str).reverse());

    }

    //数组逆序

    private void reverseAarray(int []arr){
        for(int x=0; x<arr.length/2; x++) {
            int temp = arr[x];
            arr[x] = arr[arr.length-1-x];
            arr[arr.length-1-x] = temp;
        }

     for (int y= 0 ; y<arr.length;y++){
         System.out.println(arr[y]);
     }

    }
}
