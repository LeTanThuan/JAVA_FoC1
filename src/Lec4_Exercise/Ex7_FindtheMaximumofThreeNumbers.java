
package Lec4_Exercise;

import java.util.Scanner;

public class Ex7_FindtheMaximumofThreeNumbers {
    public static void Maximum(int a, int b, int c){
        if ((a != b) && a != c && b != c){
            if ((a > b) && (a > c)){
                System.out.println(" The largest number is "+a);
            }
            else if ((b > a)&& (b>c)){
                System.out.println(" The largest number is "+b);
            }
            else{
                System.out.println(" The largest number is "+c);
            }
        }else if(a == b && b == c && a==c){
            System.out.println(a+","+b+","+c+" equal");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();
        System.out.println("Enter number c: ");
        int c = scanner.nextInt();
        Maximum(a,b,c);
    }
}
