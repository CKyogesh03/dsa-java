package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        for(int i=0;i<arr.length-1;i++){  //run lessthan 1 element bcoz inner loop start from i+1
            for (int j=i+1;j>0;j--){   //decrement to compare every previous elements
                if(arr[j]<arr[j-1]){     //compare current with already sorted previous element.
                    int temp=arr[j];
                    arr[j]=arr[j-1];     //swap if current element smaller than previous to sort it
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
