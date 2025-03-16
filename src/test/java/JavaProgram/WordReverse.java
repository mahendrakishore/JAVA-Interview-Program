package JavaProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordReverse {

    public static void main(String[] args) {
        String s = "She sells seashells by the seashore";
        String sr ="";

       for(String w : s.split(" ") ){
             String rs = "";
             for(int i=w.length()-1;i>=0;i--){
                 rs = rs+w.charAt(i);
             }
           //System.out.println(rs);
           sr=sr+" "+rs;

       }
       System.out.print(sr.trim());
    }
}
