package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inpString = scanner.nextLine();
        String reverseString = "";
        for (int i = inpString.length()-1; i>=0; i--) {
            reverseString+=inpString.charAt(i);
        }
        if(inpString.equals(reverseString)) {
            System.out.println("Inputted String is palindrom");
        } else {
            System.out.println("inputted String is not palindrome");
        }
    }
}
