package Pattren_Printing.Lecture_Ques.Pyramid;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        for (int i = 0; i < n*2-1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <=n-1 ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <=i*2-1; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i ; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
