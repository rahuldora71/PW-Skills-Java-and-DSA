package Loops_PQ;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any positive : ");
        int n= scanner.nextInt();
        int result =0;
        for (int i = 1; i <= n; i++) {
            result+=i;
        }
        System.out.println(result);
    }
}
