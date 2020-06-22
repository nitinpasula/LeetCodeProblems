package strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 * <br>
 * Examples <br>
 * Input: "hello*3"
 * Output: Ifmmp*3
 * <br>
 * Input: "fun times!"
 * Output: gvO Ujnft!
 */
public class LetterChanges {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        List<Character> vowelsList = Arrays.asList('a','e','i','o','u');
        char[] inputCharacters = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char currentChar : inputCharacters) {
            if (currentChar >= 'a' && currentChar < 'z') {
                char nextChar = (char) (currentChar + 1);
                if (vowelsList.contains(Character.valueOf(nextChar))){
                    nextChar = (char)(nextChar - 32);
                }
                result.append(nextChar);
            } else if (currentChar == 'z'){
                result.append('A');
            } else {
                result.append(currentChar);
            }
        }
        System.out.println(result.toString());
    }
}
