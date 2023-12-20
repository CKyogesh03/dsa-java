package searching;

public class BinarySearch {
    public static int search(int[] arr,int target){
        int start=0;
        int end = arr.length - 1;
        while(start<=end){
            int mid=(start+end)/2; //recursive
            if(target>arr[mid]) //focus on right side
                start=mid+1;
            else if(target<arr[mid])  //focus on left side
                end=mid-1;
            else return mid; //else if (target==arr[mid])
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
