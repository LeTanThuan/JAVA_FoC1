package Lec6_ArayList;

import java.util.Scanner;
import java.util.Arrays;
        
public class Ex13_MergeTwoSortedArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array 1: ");
        int length1 = scanner.nextInt();
        int[] a1 = new int[length1];
        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[" + i + "]= ");
            a1[i] = scanner.nextInt();
        }
        Arrays.sort(a1);
        System.out.print("enter the length of the array 2: ");
        int length2 = scanner.nextInt();
        int[] a2 = new int[length2];
        for (int i = 0; i < a2.length; i++) {
            System.out.print("a2[" + i + "]= ");
            a2[i] = scanner.nextInt();
        }
        Arrays.sort(a2);
        int length3 = (length1 + length2);
        int[] a3 = new int[length3];
        for (int i = 0; i < a2.length; i++) {
            a3[i] = a2[i];
        }
        for (int i = 0; i < a1.length; i++) {
            a3[i + length2] = a1[i];
        }
        Arrays.sort(a3);
    }
}    
