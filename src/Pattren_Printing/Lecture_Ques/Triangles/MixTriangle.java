package Pattren_Printing.Lecture_Ques.Triangles;

import java.util.Scanner;

public class MixTriangle
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int i=sc.nextInt();
        for (int k = 1; k <=i ; k++) {
            for (int l = 1; l <=k; l++) {
                if (k%2==0){
                    System.out.print((char) (64+l)+" ");
                }else {
                    System.out.print(l+" ");

                }
            }
            System.out.println();
        }
    }
}
