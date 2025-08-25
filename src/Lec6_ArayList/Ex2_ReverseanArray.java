package Lec6_ArayList;

import java.util.Scanner;
import java.util.*;

public class Ex2_ReverseanArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length Array: ");
        int n = scanner.nextInt();
        int[] temps = new int [n];
        for (int i=0; i < temps.length; i++){
            System.out.print("Temps ["+(i+1)+"]= ");
            temps[i] = scanner.nextInt();
        }
        
        for (int i=0; i < (temps.length/2); i++){
            int temp = temps[i];
            temps[i] = temps[temps.length - 1 - i];
            temps[temps.length - 1 - i] = temp;
        }
        for (int i=0 ; i<temps.length; i++){
            System.out.print(temps[i]+" ");
        }
    }
}
