
package Lec6_ArayList;

import java.util.Scanner;
import java.util.*;

public class Ex3_CountOccurrences {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length Array: ");
        int n = scanner.nextInt();
        int[] temps = new int [n];
        for (int i=0; i < temps.length; i++){
            System.out.print("Temps ["+(i+1)+"]= ");
            temps[i] = scanner.nextInt();
        }
        System.out.print("Enter number count:");
        int number = scanner.nextInt();
        int count=0;
        for (int i=0; i< temps.length; i++){
            if (temps[i] == number){
                count++;
            }
        }
        System.out.print("The number "+number+" appears "+count+" times");
    }
}
