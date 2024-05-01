package Pattren_Printing.Lecture_Ques.Special_Pattrens;

import java.util.Scanner;

public class BinaryTriangle
{
    public static void main(String[] args) {
       /* Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int i=sc.nextInt();
        int a=1;
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=k; l++) {
                System.out.print(a+" ");
                if (a==1){
                    a=0;
                }else{
                    a=1;
                }
            }
            System.out.println();
        }*/
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int i=sc.nextInt();
//        int a=1;
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=k; l++) {
                if (k%2!=0){
                    if (l%2!=0){
                        System.out.print(1);
                    }else {
                        System.out.print(0);
                    }
                }else {
                    if (l%2==0){
                        System.out.print(1);
                    }else {
                        System.out.print(0);
                    }
                }

            }
            System.out.println();
        }
    }
}
