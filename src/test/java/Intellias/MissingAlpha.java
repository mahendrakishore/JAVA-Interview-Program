package Intellias;

import java.util.HashSet;
import java.util.Set;

public class MissingAlpha {

    public static void main(String[] args) {
        String s = "hello world";
        String[] ns = s.split(" ");
        for(int i=0;i<ns.length;i++){
            String correctchar = ns[i].toLowerCase();
            Set<Character> wordchar = new HashSet<>();
            for (char c : ns[i].toLowerCase().toCharArray())wordchar.add(c);
            System.out.println("words:"+i+":missing letters");
            correctchar.chars().mapToObj(c->(char)c).filter(c->!wordchar.contains(c)).forEach(c->System.out.println(c+" "));
            System.out.println();
        }

    }
}