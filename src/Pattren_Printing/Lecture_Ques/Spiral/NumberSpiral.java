package Pattren_Printing.Lecture_Ques.Spiral;

import java.util.Scanner;

public class NumberSpiral
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n=sc.nextInt();
//        for (int i = n; i >=1; i--) {
//
//            for (int j = n; j >=1; j--)
//            {
//                System.out.print(Math.max(j, i)+" ");
//            }
//            for (int j = 2; j <=n; j++)
//            {
//                System.out.print(Math.max(j,i)+" ");
//
//            }
//            System.out.println();
//        }
//        for (int i = 2; i <=n; i++) {
//
//            for (int j = n; j >=1; j--)
//            {
//                System.out.print(Math.max(j, i)+" ");
//            }
//            for (int j = 2; j <=n; j++)
//            {
//                System.out.print(Math.max(j,i)+" ");
//
//            }
//            System.out.println();
//        }


//        Method 2
        for (int i = 1; i <=2*n-1 ; i++) {
            for (int j = 1; j <=2*n-1 ; j++) {

                int a=i,b=j;
                if (i>n) a=2*n-i;
                if (j>n) b=2*n-j;

                System.out.print(n+1-(Math.min(a,b))+" ");

            }
            System.out.println();

        }
    }
}
