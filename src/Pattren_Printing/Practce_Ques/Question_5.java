package Pattren_Printing.Practce_Ques;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        for (int i = 1; i <= n*2; i++) {
            if (i<=n){
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j =1; j <=2*n-i ; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

    }
}
