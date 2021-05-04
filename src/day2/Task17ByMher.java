package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task17ByMher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foilLength = scanner.nextInt();
        double diameterOfRoundInHexagon = 4.0; // Երբ վոր դիամետրը 4 ա կողմի երկարություննել ա 4 :D
        double diameterOfRoundOutsideHexagon = 2*diameterOfRoundInHexagon ; // արտագծած շրջանագծիննել 2 անգամ կողմ ա
        double foilThickness = 0.0025;
        double perimeter = diameterOfRoundInHexagon * 6;
        while (foilLength>0){
            foilLength -= perimeter;
            diameterOfRoundOutsideHexagon+=2*foilThickness;
        }
        System.out.println((float) diameterOfRoundOutsideHexagon);
    }
}
