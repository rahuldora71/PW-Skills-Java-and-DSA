package Loops_PQ;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter integer one : ");
        int n1= scanner.nextInt();
        int a=0,b=1,c;
        if (n1==0){
            System.out.println(n1);
        }
            else if (n1==1) {
            System.out.println(0);
            }
            else {
                System.out.print(a+", "+b);
        for (int i =2; i < n1; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(", "+c);

        }
        }
    }
}
