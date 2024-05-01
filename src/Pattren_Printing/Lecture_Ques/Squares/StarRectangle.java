package Pattren_Printing.Lecture_Ques.Squares;

import java.util.Scanner;

public class StarRectangle
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int i=sc.nextInt();
        System.out.print("Enter the no. of columns : ");
        int j=sc.nextInt();
        for (int k = 0; k <i ; k++) {
            for (int l = 0; l < j; l++) {
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}
