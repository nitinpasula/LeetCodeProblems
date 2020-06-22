package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your program should return the string true, otherwise it should return the string false. If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
 * <br>
 * <br>
 * For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
 * <br>
 * <br>
 * Examples
 * <br>
 * Input: "aa6?9"
 * Output: false
 * <br>
 * Input: "acc?7??sss?3rr1??????5"
 * Output: true
 */
public class QuestionMarks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println(hasQuestionMarks(s.nextLine()));
    }
    public static boolean hasQuestionMarks(String s){
        String newS = s.replaceAll("[^0-9?]",""); //removing all non number a questions
        System.out.println(newS);
        Pattern p = Pattern.compile("\\d\\?\\?\\?\\d");
        Matcher m = p.matcher(newS);
        while(m.find()){
            String match = m.group();
            System.out.println("Matched sequence " + match);
            int a = Integer.parseInt(match.substring(0,1));
            int b = Integer.parseInt(match.substring(match.length() - 1));
            if ( a + b == 10){
                return true;
            }
        }
        return false;
    }
}
