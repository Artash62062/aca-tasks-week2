package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.nextLine();
        String reverseString = "";
        String finalString = "";
        for (int i = firstStr.length() - 1; i >= 0; i--) {
            reverseString += firstStr.charAt(i);
        }
        if (reverseString.equals(firstStr)) {
            System.out.println(firstStr);
        } else {
            int counter = 0;

            for (int i = 1; i < reverseString.length(); i++) {
                String subStr1 = reverseString.substring(0, i);
                String subStr2 = firstStr.substring(firstStr.length() - i);
                System.out.println(subStr1);
                System.out.println(subStr2);
                if (subStr1.equals(subStr2)) {
                    counter++;
                } else {
                    break;
                }
                System.out.println(counter);
            }
            String subString = reverseString.substring(counter);
            System.out.println(subString);
            finalString = firstStr + subString;
            System.out.println(finalString);
        }
    }
}
