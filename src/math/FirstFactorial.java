package math;

import java.util.Scanner;

public class FirstFactorial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int input = Integer.parseInt(s.nextLine());
        if ( input > 18 || input < 1){
            System.out.println("Invalid input");
        }else{
            int factorial = 1;
            for( int i = input; i >=1; i--){
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }
    }
}
