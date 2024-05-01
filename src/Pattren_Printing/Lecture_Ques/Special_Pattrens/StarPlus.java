package Pattren_Printing.Lecture_Ques.Special_Pattrens;

import java.util.Scanner;

public class StarPlus
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any odd number : ");
        int i=sc.nextInt();
        if (i%2==0){
            System.out.println("You entered even number");
        }else {

        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=i; l++) {
                if (k==(i/2)+1||l==(i/2)+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }
    }
}
