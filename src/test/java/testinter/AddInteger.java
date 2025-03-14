package testinter;

public class AddInteger {

    public static void main(String[] args) {

        int[] ia = {1,2,3,4,5,6,7,8,9};
        int target = 10;
        for(int i=0;i<ia.length;i++){
            for(int j=1+1;j<ia.length;j++){
                if(ia[i]+ia[j]==10){
                    System.out.println(ia[i]+""+ia[j]);
                }
            }

        }
    }
}
