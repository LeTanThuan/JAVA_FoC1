package Lec5Loop_Exercise;

import java.util.Scanner;

public class Ex3_DrawaRectanglewithAsterisks {
    public static void drawRectangle(int height, int width){
        for(int i=1; i <= height; i++){
            for (int j=1; j<= width; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height:");
        int height = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        drawRectangle(height, width);
    }
}
