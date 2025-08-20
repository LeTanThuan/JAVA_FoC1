package Lec4_Exercise;

import java.util.Scanner;

public class Ex9_AbsoluteValuewithTernaryOperator {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter number: ");
       int number = scanner.nextInt();
       int absoluteValue = (number >= 0) ? number : -number;
       System.out.println("The absolute value is "+absoluteValue);
   }
}
