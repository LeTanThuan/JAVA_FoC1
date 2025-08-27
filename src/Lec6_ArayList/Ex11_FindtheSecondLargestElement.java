package Lec6_ArayList;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11_FindtheSecondLargestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length = scanner.nextInt();
        int[] arrayList = new int[length];
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print("array[" + i + "]= ");
            arrayList[i] = scanner.nextInt();
        }
        Arrays.sort(arrayList);
        int secondLargest = arrayList[length - 2];
        System.out.print("The second-largest element is: " + secondLargest);
    }
}
