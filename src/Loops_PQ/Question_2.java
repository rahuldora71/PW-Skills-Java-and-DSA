package Loops_PQ;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Which table you want : ");
        int n= scanner.nextInt();
        for (int i = n; i <=n*10; i+=n) {
            System.out.println(i);
        }

    }
}
