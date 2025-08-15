package Lec3_Exercise;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number Int: ");
        int number = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Number :"+ number);
        System.out.println("Sentence : "+ sentence);
    }
}
