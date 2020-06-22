package strings;

import java.util.Scanner;

public class BinaryReversal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Binary represenation of string, " + Integer.toBinaryString(Integer.parseInt(input)));
        String reversedBinaryString = new StringBuilder(Integer.toBinaryString(Integer.parseInt(input))).reverse().toString();
        System.out.println("Reversed binary representation "+reversedBinaryString);
        reversedBinaryString += reversedBinaryString.length() % 8 > 0 ? "0000000".substring(0, 8 - reversedBinaryString.length() % 8) : "";
        System.out.println(Integer.parseInt(reversedBinaryString, 2));

       // System.out.println(Integer.parseInt("1234", 10));



    }
}

