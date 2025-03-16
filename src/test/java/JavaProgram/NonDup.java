package JavaProgram;

import java.util.ArrayList;
import java.util.List;

public class NonDup {
    public static void main(String[] args) {
        String s  = "Swiss";
        char[] ca = s.toCharArray();
        List<Character> cl = new ArrayList<>();
        for(int i=0;i<ca.length;i++){
            if(!cl.contains(ca[i])){
                cl.add(ca[i]);
                System.out.println(ca[i]);
            }
        }

    }

}
