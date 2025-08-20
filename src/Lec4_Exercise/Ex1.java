package Lec4_Exercise;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scanner.nextInt();
        if ((number % 2) == 0) {
            System.out.println(number+" is a Even Number");
        }else{
            System.out.println(number+" is an Odd Number");
        }
    }
}
