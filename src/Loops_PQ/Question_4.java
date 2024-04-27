package Loops_PQ;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Write any word : ");
        String st= scanner.nextLine();
        boolean result=false;
        for (int i = 0; i < st.length()/2; i++) {
            if (st.charAt(i)==st.charAt(st.length()-1-i)){
                result =true;
            }else{
                result =false;
            }
        }
        if (result){
            System.out.println("Given String is a palindrome.");
        }else{
            System.out.println("Given String is not a palindrome.");
        }
    }
}
