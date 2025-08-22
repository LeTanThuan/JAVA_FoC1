package Lec5Loop_Exercise;

import java.util.Scanner;

public class Ex1_CalculatetheSumofNumbersfrom1toN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number= scanner.nextInt();
        int sum=0;
        for (int i=1; i<= number; i++){
            sum+=i;
        }
        System.out.println(" Calculate the Sum of Numbers from 1 to "+number+" is: "+sum);
    }
}
