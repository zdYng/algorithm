package code;

/**
 * 选择排序
 */
public class SelectionSort {

    public static int[] selectionSort(int[] array){

        for(int i=0;i<array.length;i++){
            int min = i;
            for(int j=i;j<array.length;j++){
                if(array[j]<array[min]){
                    min = j;
                    System.out.println("min: " + min);
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;

    }

    public static void main(String[] args) {
        int[] array ={1,5,4,2,6,8};
        int[] tt = selectionSort(array);
        for (int i:tt){
            System.out.println(i);
        }

    }
}
