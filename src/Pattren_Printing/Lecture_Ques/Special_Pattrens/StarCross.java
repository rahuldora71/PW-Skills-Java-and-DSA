package Pattren_Printing.Lecture_Ques.Special_Pattrens;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter An odd number : ");
        int i=sc.nextInt();
        if (i%2==0){
            System.out.println("You entered even number");
        }else {
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=i; l++) {
                if (l==k||l==i-k+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }}

    }
}
