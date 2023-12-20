package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5, 3, 4, 1, 2};
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - 1 - i; // to leave sorted elements in RHS
            int maxIndex=0;
            // finding max index
            for (int j = 1; j <= last; j++) {  //start from 1 bcoz maxIndex have 0 at beginning
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;                  //change index of max
                }
            }
            //swapping
            int temp = arr[maxIndex];             //swap to last index. use last not j
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
