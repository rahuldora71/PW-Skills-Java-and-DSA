package Loops_PQ;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter integer one : ");
        int n1= scanner.nextInt();
        System.out.print("Enter integer two : ");
        int n2= scanner.nextInt();
        int smallest_int;
        int result=0;

        if (n1>n2){
               smallest_int=n2;
        }else if(n2>n1){
            smallest_int=n1;
        }
        else {
            smallest_int=n2;
        }
            for (int i = 1; i <= smallest_int; i++) {
                if (n1%i==0&&n2%i==0){
                    result=i;
                }
            }
        System.out.println("The GOC of "+n1+", "+n2+" is : "+result);
    }
}
