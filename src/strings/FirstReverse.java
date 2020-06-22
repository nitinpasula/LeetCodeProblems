package strings;

import java.util.Scanner;

public class FirstReverse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String reversedInput = new StringBuilder(input).reverse().toString();
        System.out.println(reversedInput);
    }
}
