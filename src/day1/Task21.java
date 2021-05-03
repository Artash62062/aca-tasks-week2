package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foilLength = scanner.nextInt();
        double diameter = 4.0;
        double foilThickness = 0.0025;
        while (foilLength>0){
            double perimeter = diameter *Math.PI;
            foilLength -= perimeter;
            diameter+=2*foilThickness;
        }
        System.out.println((float) diameter);
    }
}
