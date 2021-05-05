package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 */
public class Task19V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String palindromeLeft = smallestPalindromeLeft(inputString);
        String palindromeRight = smallestPalindromeRight(inputString);
        System.out.println(palindromeLeft);
        System.out.println(palindromeRight);
        if (palindromeLeft.length() < palindromeRight.length()) {
            System.out.println("The smallest is Palindrome from left " + palindromeLeft);
        } else {
            System.out.println("the smallest is Palindrome from Right " + palindromeRight);
        }
    }

    public static boolean isPalindrome(String string) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString.append(string.charAt(i));
        }
        return reverseString.toString().equals(string);
    }

    public static String reverseString(String inpString) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = inpString.length() - 1; i >= 0; i--) {
            reverseString.append(inpString.charAt(i));
        }
        return reverseString.toString();
    }

    public static String smallestPalindromeLeft(String inputString) {
        String secString = inputString;
        String str = "";
        String revString;
        for (int i = 0; i < inputString.length(); i++) {
            str += inputString.charAt(i);
            revString = reverseString(str);
            secString = inputString + revString;
            if (isPalindrome(secString)) {
                break;
            }
        }
        return secString;
    }

    public static String smallestPalindromeRight(String inputString) {
        String secString = inputString;
        String str = "";
        String revString;
        for (int i = inputString.length() - 1; i >= 0; i--) {
            str += inputString.charAt(i);
            revString = reverseString(str);
            secString = revString + inputString;
            if (isPalindrome(secString)) {
                break;
            }
        }
        return secString;
    }

}
