package JavaProgram;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        String s = "She sells seashells by the seashore. The shells she sells are surely seashells";
        Map<String,Integer> m = new HashMap<>();
       for(String w : s.split(" ") ){
             if(m.containsKey(w)){
                 m.put(w,m.get(w)+1);}
             else{
                 m.put(w,1);
             }
       }
     for(Map.Entry<String,Integer> nm: m.entrySet()){
          System.out.println(nm.getKey()+":"+nm.getValue());
     }
    }
}
