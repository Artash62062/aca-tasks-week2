package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        int count =0;
            for (int i = 0; i < string1.length(); i++) {
                for (int j = 0; j <string2.length() ; j++) {
                    if(string1.charAt(i)==string2.charAt(j)){
                        string2 = removeCharFromString(string1.charAt(i),string2);
                        string1 = removeCharFromString(string1.charAt(i),string1);
                        count++;
                    }
                }
            }
        System.out.println(count);

    }

    public static String removeCharFromString(char charAtIndex,String str) {
        int indexOfChar =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == charAtIndex) {
                indexOfChar = i;
                break;
            }
        }
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(i== indexOfChar)  {
                continue;
            }
            newStr+= str.charAt(i);
        }
        return newStr;
    }
}
