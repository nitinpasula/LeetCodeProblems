package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */
public class ValidParantheses {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        boolean isValid = true;
        if(input.isEmpty()){
            isValid = true;
        }else{
            int inputLength = input.length();
            if( inputLength % 2 != 0){
               isValid = false;
            }else{
                Map<Character, Character> paranthesis = new HashMap<Character,Character>();
                paranthesis.put(')','(');
                paranthesis.put('}','{');
                paranthesis.put(']','[');

               Stack<Character> stack = new Stack<Character>();
               for ( int i = 0; i < inputLength; i++){
                   char c = input.charAt(i);
                   if ( paranthesis.containsKey(c)){
                       char topElement = stack.empty() ? '#': stack.pop();
                       if ( topElement != paranthesis.get(c)){
                           isValid = false;
                           break;
                       }
                   } else{
                       stack.push(c);
                   }
               }
               if ( !stack.empty()){
                   isValid = false;
               }
            }
        }
        System.out.println(isValid);

    }



}
