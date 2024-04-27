package JavaMethods_PQ;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Write any natural no : ");
        int a=scanner.nextInt();
        for (int i = 0; i <= a; i++) {
            square(i);
        }
    }
    public static void square(int n){
        System.out.print(n*n+", ");
    }
}
