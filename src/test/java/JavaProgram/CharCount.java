package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void main(String[] args) {
        String s = "TO find duplicates";
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        for(Character c : s.toCharArray()){
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }
            else {
                m.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> e : m.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }



}
