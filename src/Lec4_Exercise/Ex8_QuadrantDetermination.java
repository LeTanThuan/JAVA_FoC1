
package Lec4_Exercise;

import java.util.Scanner;

public class Ex8_QuadrantDetermination {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = scanner.nextDouble();
        System.out.print("Enter Y: ");
        double y = scanner.nextDouble();
        if (x>0 && y > 0){
            System.out.println(" Quadrant 1: ");
        }else if(x < 0 && y > 0){
            System.out.println("Quadrant 2:");
        }else if(x < 0 && y < 0){
            System.out.println("Quadrant 3:");
        }else if (x > 0 && y < 0){
            System.out.println("Quadrant 4:");
        }else if (x==0 && y==0){
            System.out.println("The point is on an axis.");
        }
        
    }
}
