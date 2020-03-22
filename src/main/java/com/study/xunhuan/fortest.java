package com.study.xunhuan;

/**
 * Created by Administrator on 2016/5/1.
 */

/*
* shuixianhua ()水仙花数
* 打印形状
* 9*9乘法表
*
* */
public class fortest {
    public static void main(String[] args) {
        fortest fortest = new fortest();
        fortest.chengfabiao();

    }

    /*乘法表*/
    private  void chengfabiao(){
       //可以给for循环起名字 在break的时候直接直接 break wc; 退出wc的循环
       wc: for (int i = 1 ; i<=15;i++){
          nc:  for (int j =1; j<=i;j++ ) {
              if (i==12){
                  break wc;
              }
                System.out.print(j+"*"+i+"="+i*j+"\t");

            }
            System.out.println();
        }



    }


    /*
    *  打印出下面的形状
*
**
***
****
*****
    *
    * */
    private  void xinxin(){

        for (int i = 0 ;i<5;i++){
            for (int  j = 0; j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println("\r");

        }
    }


    private void  shuixianhua(){
        //        Scanner scanner = new Scanner(System.in);
        int count=0;
        for (int i= 100; i <1000; i++){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;

            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){

                count++;

            }
        }
        System.out.println(count);

    }
}
