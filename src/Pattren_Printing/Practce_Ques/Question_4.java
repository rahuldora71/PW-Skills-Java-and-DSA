package Pattren_Printing.Practce_Ques;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2==0) System.out.print((char) (64+j));
                else System.out.print(j);

            }
            System.out.println();
        }
    }
}
