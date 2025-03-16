package JavaProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseIntArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int left =0, right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));
    }

}
