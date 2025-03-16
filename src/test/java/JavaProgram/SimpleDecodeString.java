package JavaProgram;

import java.util.Stack;

public class SimpleDecodeString {

    public static void main(String[] args) {
        String input = "2{abc}3{cd2{p}}ef";
        Stack<String> stack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int number =0;
        for(char c : input.toCharArray()){
             if(Character.isDigit(c)){
                 number = number * 10 + (c - '0');
             } else if (c=='{') {
                  stack.push(currentString.toString());
                  stack.push(String.valueOf(number));
                 currentString = new StringBuilder();
                 number =0;
             } else if (c=='}') {
                 int repeatTimes = Integer.parseInt(stack.pop());
                 String previousString = stack.pop();
                 currentString = new StringBuilder(previousString + currentString.toString().repeat(repeatTimes));
             } else {
                 currentString.append(c);
             }
        }
        System.out.println(currentString.toString());

        }
    }


