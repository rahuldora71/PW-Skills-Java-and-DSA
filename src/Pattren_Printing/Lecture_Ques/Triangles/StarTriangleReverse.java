package Pattren_Printing.Lecture_Ques.Triangles;

import java.util.Scanner;

public class StarTriangleReverse
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int i=sc.nextInt();
        for (int k = i; k >=1 ; k--) {
            for (int l = 1; l <=k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
