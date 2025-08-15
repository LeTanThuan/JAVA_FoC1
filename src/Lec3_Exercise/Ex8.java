package Lec3_Exercise;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter multipe: ");     
        String word = scanner.nextLine();
        System.out.println("Multipe: ");
        Scanner wordScanner = new Scanner(word);
        
        while (wordScanner.hasNext()){
            String multipeWord= wordScanner.next();
            System.out.println(multipeWord);
        }
    }
}
