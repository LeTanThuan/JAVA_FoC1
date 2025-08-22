package Lec5Loop_Exercise;

import java.util.Scanner;

public class Ex4_DrawaRightAngledTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter High: ");
        int h = scanner.nextInt();
        for (int i=1; i<=h; i++){
            for (int j= 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
