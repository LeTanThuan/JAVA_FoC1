package Lec6_ArayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex7_RemoveDuplicateElements {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> originalList) {
        ArrayList<Integer> ResultArray = new ArrayList<>();
        for (int number : originalList) {
            if (!ResultArray.contains(number)) {
                ResultArray.add(number);
            }
        }
        return ResultArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Array_List = new ArrayList<>();
        int Number;

        System.out.println("Enter Number Int (Enter -1 to Break!)");

        while (true) {
            System.out.print("Enter Number: ");
            Number = scanner.nextInt();

            if (Number == -1) {
                break;
            }

            Array_List.add(Number);
        }
        ArrayList<Integer> New_Array = removeDuplicates(Array_List);

        System.out.print("Output: " + New_Array);

    }
}
