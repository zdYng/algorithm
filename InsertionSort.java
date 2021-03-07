package com.qian;

import com.sun.tools.javac.tree.Pretty;

/**
 * 插入算法
 */

public class InsertionSort {

    public static int[] insertSort(int[] array){

        if(array.length==0){
            return array;
        }
        int current ;
        for(int i=0;i<array.length-1;i++){
            current = array[i+1];
            int preIndex = i;
            while(preIndex>=0 && current<array[preIndex]){
                array[preIndex+1] = array[preIndex];
                preIndex--;
            }
            array[preIndex+1] = current;
            System.out.println("preIndex+1: "+current);
        }
        return  array;
    }

    public static int[] insertSort2(int[] array){
        if(array.length==0){
            return array;
        }
        for(int i=1;i<array.length;i++){

            for(int j=i;j>0;j--){

                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }

        }
        return array;


    }

    public static void main(String[] args) {

        int[] a= new int[]{3,2,1,6,5,4};
        int[]b  = new int[]{3,2,1,6,5,4};
        int[] result = insertSort(a);

        int[] result2 = insertSort2(b);
        for(int i:result2){
            System.out.println(i);
        }
    }

}
