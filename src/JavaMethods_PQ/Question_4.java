package JavaMethods_PQ;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Write any natural no : ");
        int a=scanner.nextInt();
        digitsInInput(a);
        square(a);
    }
    public static void square(int n){
        System.out.print( "the square is : "+n*n);
    }
    public static void digitsInInput(int n){

        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        System.out.println("No. of digits is : "+count);
    }
}
