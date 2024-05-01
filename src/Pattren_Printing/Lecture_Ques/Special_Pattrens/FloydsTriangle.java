package Pattren_Printing.Lecture_Ques.Special_Pattrens;

import java.util.Scanner;

public class FloydsTriangle
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int i=sc.nextInt();
        int a=1;
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=k; l++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
