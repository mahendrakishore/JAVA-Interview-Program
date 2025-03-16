package testinter;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0};
        int l =0, r = arr.length-1;

        while(l<r){
            while(l<r && arr[l]==0) l++;
            while(l<r && arr[r]==1) r--;
        if(l<r){
            arr[l]=0;
            arr[r]=1;
            l++;
            r--;
        }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
