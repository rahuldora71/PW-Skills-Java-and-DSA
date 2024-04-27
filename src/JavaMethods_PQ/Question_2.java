package JavaMethods_PQ;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Write the radius of circle : ");
        double a=scanner.nextLong();
        areaOfCircle(a);

    }
    public static void areaOfCircle(double b){
        double area=3.14159*b*b;
        System.out.println("The area of circle is : "+area);

    }
}
