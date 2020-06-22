package regex;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println(findLongestWord(s.nextLine()));
    }

    /**
     * Finds the longest word in a string excluding any punctuation marks
     * Example: "Fun&!! love" will return "love"
     * @param s
     * @return
     */
    public static String findLongestWord(String s){
        String[] words = s.split(" ");
        String longestWord = "";
        int longestWordLength = 0;
        for ( String word : words){
            String wordWithoutPunctuation = word.replaceAll("[^a-zA-Z\\d]", "");
            if (wordWithoutPunctuation.length() > longestWordLength) {
                longestWord = wordWithoutPunctuation;
                longestWordLength = wordWithoutPunctuation.length();
            }
        }
        return longestWord;
    }
}
