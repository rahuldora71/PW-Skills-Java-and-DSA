package Pattren_Printing.Lecture_Ques.Composite_Patterns;

import java.util.Scanner;

public class StarPyramid
{
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter any number : ");
//        int i=sc.nextInt();
//        for (int j = 1; j <=i; j++) {
//            for (int k = 1; k <=i-j; k++) {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <=j*2-1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //  Method no 2
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int i=sc.nextInt();
        int nsp=i-1;
        int nst=1;
        for (int j = 1; j <=i; j++) {
            for (int k = 1; k <=nsp; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=nst; k++) {
                System.out.print("* ");
            }
            nst+=2;
            nsp--;
            System.out.println();
        }

    }
}
