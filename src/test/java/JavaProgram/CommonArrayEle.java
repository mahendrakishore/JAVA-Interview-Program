package JavaProgram;

import io.cucumber.java.sl.In;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonArrayEle {
    public static void main(String[] args) {
        String[] arr = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
            Set<String> set = new HashSet<>();
            for(String n : arr[0].split(", ")){
               // n.trim();
                set.add(n);
            }
            Set<String> commonElements = new HashSet<>();
            for(String n : arr[1].split(", ")){
            //n.trim();
              if(set.contains(n)){
                commonElements.add(n);
             }
            }
            System.out.println(commonElements);
    }
}
