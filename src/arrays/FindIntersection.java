package arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindIntersection {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] input = new String[2];
        int i = 0;
        while(i < 2){
            input[i]=s.nextLine();
            i++;
        }
        System.out.println(intersection(input));

    }

    public static String intersection(String[] strArr){
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        String[] str1 = strArr[0].split(", ");
        String[] str2 = strArr[1].split(", ");
        if ( Integer.parseInt(str1[0]) > Integer.parseInt(str2[str2.length - 1]) || Integer.parseInt(str2[0]) > Integer.parseInt(str1[str1.length - 1])){
            return "false";
        }else{
            Map<String, String> str1Map = new HashMap<String, String>();
            for ( String s : str1) {
                str1Map.put(s, s);
            }
            String result = "";

            for (String s: str2){
                if (str1Map.containsKey(s)){
                   result = result + s + "," ;
                }
            }
            if (!result.isEmpty()){
                return result.substring(0, result.length()-1);
            }
        }
        return "false";
    }
}
