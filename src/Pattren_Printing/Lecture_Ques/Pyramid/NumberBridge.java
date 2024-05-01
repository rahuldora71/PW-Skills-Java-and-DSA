package Pattren_Printing.Lecture_Ques.Pyramid;

import java.util.Scanner;

public class NumberBridge
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        for (int i = 1; i < n*2; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <=n-1 ; i++) {
            int a=1;
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(j+" ");
                a++;
            }
            for (int k = 1; k <=i*2-1; k++) {
                System.out.print("  ");
                a++;
            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(n+i+j-1+" ");
                a++;
            }
            System.out.println();
        }

//      Method 2nd
/*
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        for (int i = 1; i < n*2; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <=n-1 ; i++) {
            int a=1;
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(a+" ");
                a++;
            }
            for (int k = 1; k <=i*2-1; k++) {
                System.out.print("  ");
                a++;
            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
*/

    }
}
