package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String revString = "";
        if(inputString.length()%2!=0) {
            for (int i = inputString.length()-1; i>=0; i--) {
                revString+=inputString.charAt(i);
            }
        } else {
            revString = inputString;
        }

        System.out.println(revString);
    }
}
