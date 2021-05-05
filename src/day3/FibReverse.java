package day3;

import java.util.Arrays;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class FibReverse {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[arr.length-1] = 1;
        arr[arr.length-2] = 1;
        for (int i = arr.length-3; i >=0; i--) {
            arr[i] = arr[i+2] + arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
