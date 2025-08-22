
package Lec5Loop_Exercise;

import java.util.Scanner;

public class Ex10_Draw {
public static void DrawTriangle(int h){
    int a=h;
    int b=1;
    for (int i=1 ; i<= h ; i++){
        for (int j = 1; j <= a; j++){
            System.out.print(" ");
        }
        a--;
        for (int k= 1; k<=b; k++){
            System.out.print("*");
        }
        b=b+2;
        System.out.println("");
    }
    System.out.print("");
}

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Height Triangle: ");
        int height = scanner.nextInt();
        DrawTriangle(height);
    }
}
