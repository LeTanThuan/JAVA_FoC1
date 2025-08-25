package Lec6_ArayList;

import java.util.Scanner;
import java.util.*;

public class ArayWeather {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many day's temperatures? ");
        int days = console.nextInt();
        int[] temps = new int [days];
        int sum = 0;
        for (int i = 0; i < temps.length; i++){
            System.out.print("Day"+ (i+1) +" is high temp");
            temps[i] = console.nextInt();
            sum+= temps[i];
        }
        double average = (double) sum/days;
        int count= 0;
        for (int i=0; i<temps.length; i++){
            if (temps[i] > average){
                count++;
            }
        }
        System.out.printf("Average temp = %.1f",average);
        System.out.println("");
        System.out.print(count+" days above average");
    }
}
