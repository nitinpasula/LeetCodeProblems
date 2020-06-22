package strings;

import java.util.Scanner;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 */

public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split(", ");
        // find the longest common prefix
        // 1. Brute force approach
        String lcp = "";
        if ( input.length == 0){
            System.out.println("");
        }
        String firstElement = input[0];

        for ( int i =1; i <= firstElement.length(); i++){
            String prefix = firstElement.substring(0, i);
            boolean found = true;
            for ( int j = 0; j < input.length; j++){
                String subString = i > input[j].length() ? input[j] : input[j].substring(0, i);
                if (  ! subString.equals(prefix)){
                    found = false;
                    break;
                }
            }
            if ( found ) {
                lcp = prefix;
            }
        }
        System.out.println(lcp);
        //TODO See leetcode for efficient solution, vertical scanning, each character at same position and when smallest string is found return
    }
}
