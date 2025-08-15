package Lec3_Exercise;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Float Number A:");
        float a = scanner.nextFloat();
        System.out.print("Enter a Float Number B:");
        float b = scanner.nextFloat();
        float average= (a+b)/2;
        System.out.println("Average = "+average);
    }
    
}
