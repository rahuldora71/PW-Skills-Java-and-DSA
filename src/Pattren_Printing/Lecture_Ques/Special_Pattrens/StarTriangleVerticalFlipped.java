package Pattren_Printing.Lecture_Ques.Special_Pattrens;

import java.util.Scanner;

public class StarTriangleVerticalFlipped
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int i=sc.nextInt();
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=i; l++) {
                if (l>=(i-k)+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
