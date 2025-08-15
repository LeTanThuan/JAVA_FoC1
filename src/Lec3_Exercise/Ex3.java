package Lec3_Exercise;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number a:");
        long a = scanner.nextLong();
        System.out.print("Enter Number b:");
        long b = scanner.nextLong();
        long sum= (a+b);
        System.out.println("Sum="+sum);
       
    }
}
