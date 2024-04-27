package JavaMethods_PQ;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Write First no : ");
        int a=scanner.nextInt();
        System.out.print("Write Second no : ");
        int b=scanner.nextInt();
        if (a<b){
            oddNumbers(a,b);
        } else if (b < a) {
            oddNumbers(b,a);
        }else {
            System.out.println("First and second number is same");
        }

    }
    public static void oddNumbers(int x,int y){
        for (int i = x; i <= y; i++) {
            if (i%2!=0){
                System.out.print(i+", ");
            }

        }
    }
}
