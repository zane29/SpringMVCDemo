package com.study.fanshe;

/**
 * Created by Administrator on 2016/7/13.
 */
public class Main {
    public static void main(String[] args) {
        int [] arr={34,45,56,8,6,72,98,55};
        Main main = new Main();
//        main.maopao(arr);
//        main.pringarray(arr);
        main.xuanzhepaixu(arr);
        main.pringarray(arr);
    }



    /**
     * 选择排序
     * 把0索引的元素，和索引1以后的元素都进行比较，第一次完毕，最小值出现在了0索引。同理，其他的元素就可以排好。
     * */

        public static void xuanzhepaixu(int[] arr) {
            for(int x=0; x<arr.length-1; x++) {
                for(int y=x+1; y<arr.length; y++) {
                    if(arr[y] < arr[x]) {
                        int temp = arr[x];
                        arr[x] = arr[y];
                        arr[y] = temp;
                    }
                }
            }
        }


     /**
     * 冒泡排序
      * 相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处。同理，其他的元素就可以排好。
     * */
    private void maopao(int[] arr){
        for (int j=0;j<=arr.length-1;j++){
            for (int i = 0; i < arr.length - 1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private  void  pringarray(int []arr) {
        for (int i =0 ;i<arr.length;i++){
            if (i==0){
                System.out.print("[");
            }
            if (i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
