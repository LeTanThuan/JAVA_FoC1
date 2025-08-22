/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5Loop_Exercise;

import java.util.Scanner;

public class Ex8_InputValidation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        do{
            if (number<1 || number >10){
                System.out.print("Invalid number, please try again: ");
                number = scanner.nextInt();
            }
        }while((number <=0) || (number >10));
        System.out.println("You entered the number: "+number);
    }
}
