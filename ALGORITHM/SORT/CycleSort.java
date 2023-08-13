package Sort;

import java.util.Arrays;

public class CycleSort {
    static void sortcycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i];
            if ( arr[i] != correct_index) {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            } else
                i++;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 1,0 };
        sortcycle(arr);
        System.out.println(Arrays.toString(arr));
    }
}