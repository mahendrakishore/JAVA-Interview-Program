package Intellias;

public class Aphabest {

    public static void main(String[] args) {
        String s = "hello world";
        char[] alpha = {'a', 'b' ,'c' ,'f' ,'g', 'i', 'j', 'k', 'm', 'n','p', 'q', 's', 't', 'u','v' ,'x' ,'y', 'z'};
        char[] old = s.toCharArray();
        for(int i =0;i<alpha.length;i++){
            for(int j=0;j< old.length;j++)
               if(alpha[i]!=old[j]){
               System.out.println(alpha[i]);
           }
        }
    }
}
