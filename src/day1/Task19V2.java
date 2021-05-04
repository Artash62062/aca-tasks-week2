package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task19V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String secString = inputString;
        for (int i = 0; i < secString.length(); i++) {
            secString += inputString.charAt(i);
            if (isPalindrome(secString)) {
                break;
            }
        }
        System.out.println(secString);
    }

    public static boolean isPalindrome(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        return reverseString.equals(string);
    }
}
