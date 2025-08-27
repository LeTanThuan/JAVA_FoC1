package Lec6_ArayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5_FilterEvenNumbers {

    public static ArrayList<Integer> Array_List(int[] arr) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        return evenNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = scanner.nextInt();
        int[] temps = new int[n];

        for (int i = 0; i < temps.length; i++) {
            System.out.print("temps[" + (i + 1) + "] = ");
            temps[i] = scanner.nextInt();
        }

        ArrayList<Integer> ketQua = Array_List(temps);

        System.out.println("The even numbers in the array are: " + ketQua);
    }
}
