package Pattren_Printing.Lecture_Ques.Pyramid;

import java.util.Scanner;

public class StarDiamond
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int i=sc.nextInt();
        for (int j = 1; j <=i; j++) {
            for (int k = 1; k <=i-j; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=j*2-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = i-1; j >=1; j--) {
            for (int k = 1; k <=i-j; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=j*2-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
