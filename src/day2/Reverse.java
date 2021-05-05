package day2;

import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        String str = "foo(bar)baz(blim(cat))";
        int len = str.length();
        System.out.println(reverseParentheses(str, len));
    }

    static void reverse(char[] arr, int firstIndex, int secondIndex) {
        if (firstIndex < secondIndex) {
            char symbol = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = symbol;
            reverse(arr, firstIndex + 1, secondIndex - 1);
        }
    }

    static String reverseParentheses(String string, int length) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == '(') {
                stack.push(i);
            } else if (string.charAt(i) == ')') {
                char[] array = string.toCharArray();
                reverse(array, stack.peek() + 1, i);
                string = String.copyValueOf(array);
                stack.pop();
            }
        }
        String res = "";
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) != ')' && string.charAt(i) != '(') {
                res += (string.charAt(i));
            }
        }
        return res;
    }
}