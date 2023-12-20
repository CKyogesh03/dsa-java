package sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void method1(){
        int[]arr={15,14,13,12};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                int temp=arr[j];
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //reduces comparisons
    public static void method2(){
        int[] arr = {5, 3, 4, 1, 2};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){  // i – to stop comparison before sorted elements
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        method1();
    }
}