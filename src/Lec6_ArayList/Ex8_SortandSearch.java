
package Lec6_ArayList;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8_SortandSearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] temps = new int [5];
        for (int i=0; i<5; i++){
            System.out.print("temps["+(i+1)+"]= ");
            temps[i]= scanner.nextInt();
        }
        Arrays.sort(temps);
        System.out.print("Enter a number to find: ");
        int numberFind = scanner.nextInt();
        
        
        for (int i=0; i<5; i++){
            if (numberFind == temps[i]){
                System.out.println("The number "+numberFind+" was found at index "+i);
            }
        }
        
    }
}
