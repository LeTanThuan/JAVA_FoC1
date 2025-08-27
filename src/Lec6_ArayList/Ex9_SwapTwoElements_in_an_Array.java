package Lec6_ArayList;

import java.util.Scanner;

public class Ex9_SwapTwoElements_in_an_Array {
    public static void swap(int[] temps, int i, int j){
        int temp = temps[i];
        temps[i] =  temps[j];
        temps[j] = temp;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number Array: ");
        int number = scanner.nextInt();
        int[] temps = new int [number];
        for (int i=0; i<5; i++){
            System.out.print("temps["+i+"]= ");
            temps[i]= scanner.nextInt();
        }
        System.out.print("Enter Index 1: ");
        int index_one = scanner.nextInt();
        System.out.print("Enter Index 2: ");
        int index_two = scanner.nextInt();
        swap(temps, index_one, index_two);
        System.out.println("Array after the function call!");
        for (int i=0; i<temps.length; i++){
            System.out.print(temps[i]+" ");
        }
   } 
}
