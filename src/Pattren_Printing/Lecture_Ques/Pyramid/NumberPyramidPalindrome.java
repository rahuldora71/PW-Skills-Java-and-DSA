package Pattren_Printing.Lecture_Ques.Pyramid;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int i=sc.nextInt();
        for (int j = 1; j <=i; j++) {
            for (int k = 1; k <=i-j; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=j; k++) {
                System.out.print(k+" ");
            }
            for (int k = j-1; k >=1 ; k--) {
                System.out.print(k+" ");

            }

            System.out.println();
        }
    }
}
