package Pattren_Printing.Lecture_Ques.Squares;

import java.util.Scanner;

public class AlphabetSquare
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int i=sc.nextInt();
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=i; l++) {
                System.out.print((char) (64+k)+" ");
            }
            System.out.println();
        }
    }
}
