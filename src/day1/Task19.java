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
        String input = scanner.nextLine();
        String subString1 = input.substring(0, (input.length())/2);
        System.out.println(subString1);
        String subString2 ;
        if(input.length()%2!=0) {
           subString2 = input.substring(input.length()/2+1);
        } else {
            subString2 = input.substring(input.length()/2);
        }
        if(subString1.length()==subString2.length()){
            subString1 += input.charAt(input.length()/2);
        }
        System.out.println(subString2);
    }
}
