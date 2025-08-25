package Lec6_ArayList;

import java.util.Scanner;
import java.util.*;

public class Ex1_FindtheMaximumandMinimumValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length Array: ");
        int n = scanner.nextInt();
        int[] temps = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Temps["+(i+1)+"]=");
            temps[i] = scanner.nextInt();
        }
        Arrays.sort(temps);
        System.out.println("The maximum value is: "+temps[n-1]);
        System.out.println("The minimum value is: "+temps[0]);
    }
}
