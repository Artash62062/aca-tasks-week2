package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        boolean numValid = false;
        boolean sizeValid = false;
        boolean symbolValid = false;
        boolean letterValid = false;
        for (int i = 0; i < pass.length(); i++) {
            if (((int) pass.charAt(i) <= 122 && (int) pass.charAt(i) >= 97) && ((int) pass.charAt(i) <= 90 && (int) pass.charAt(i) >= 65)) {
                letterValid = true;
                break;
            }
        }
        if (pass.length() >= 6 && pass.length() <= 16) {
            sizeValid = true;
        }

        for (int i = 0; i < pass.length(); i++) {
            if (((int) pass.charAt(i) <= 57 && (int) pass.charAt(i) >= 48)) {
                numValid = true;
                break;
            }
        }
        for (int i = 0; i < pass.length(); i++) {
            if ((int) pass.charAt(i) == 35 || (int) pass.charAt(i) == 36 || (int) pass.charAt(i) == 64) {
                symbolValid = true;
                break;
            }
        }

        if (numValid && letterValid && sizeValid && symbolValid) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }
}
