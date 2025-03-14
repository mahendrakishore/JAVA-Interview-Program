package Intellias;

public class LargestNumList {

    static int findLargest(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num>max){
                max=num;
            }
        }
        return max;
   }
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};

        int largest = findLargest(numbers);
   System.out.println(largest);
}

    }
