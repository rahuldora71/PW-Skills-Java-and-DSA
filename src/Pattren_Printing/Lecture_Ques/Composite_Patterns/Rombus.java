package Pattren_Printing.Lecture_Ques.Composite_Patterns;

import java.util.Scanner;

public class Rombus
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int i=sc.nextInt();
        for (int j = 1; j <=i; j++) {
            for (int k = 1; k <=i-j; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
