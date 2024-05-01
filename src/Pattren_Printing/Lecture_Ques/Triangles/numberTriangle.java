package Pattren_Printing.Lecture_Ques.Triangles;

import java.util.Scanner;

public class numberTriangle
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int i=sc.nextInt();
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=k; l++) {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
