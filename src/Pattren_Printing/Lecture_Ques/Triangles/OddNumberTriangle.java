package Pattren_Printing.Lecture_Ques.Triangles;

import java.util.Scanner;

public class OddNumberTriangle
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int i=sc.nextInt();
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=k*2-1; l+=2) {
                System.out.print(l+" ");
//                System.out.print(2*l-1+" ");   We can use this whithout any change on loop
            }
            System.out.println();
        }
    }
}
