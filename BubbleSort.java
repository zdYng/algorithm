package code;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 冒泡排序
 */

public class BubbleSort {

    public static int[] bubble(int[] array){

        if(array.length==0)
            return array;
        for(int i=0;i<array.length;i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array.length - 1 - i);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array ={1,5,4,2,6,8};
        int[] tt = bubble(array);
//        for (int i:tt){
//            System.out.println(i);
//        }


    }

}
