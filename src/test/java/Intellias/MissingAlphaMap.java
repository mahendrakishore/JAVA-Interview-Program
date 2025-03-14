package Intellias;

import java.util.HashSet;
import java.util.Set;

public class MissingAlphaMap
{

    public static void main(String[] args) {
        String apha = "abcdefghijklmnopqrstuvwxyz";
        String wordAlpha = "The quick brown fox jumps over the lazy dog";
        char[] ca = wordAlpha.toLowerCase().toCharArray();
        Set<Character> wordAlphaDistinct = new HashSet<>();
        for(char c : ca){
            if(c!=' ') {
                wordAlphaDistinct.add(c);
            }
        }
        System.out.println(wordAlphaDistinct);
        for(char ac : apha.toCharArray()){
            if(wordAlphaDistinct.contains(ca)){
                System.out.println("alphabet contained");
            }

        }

    }

}
