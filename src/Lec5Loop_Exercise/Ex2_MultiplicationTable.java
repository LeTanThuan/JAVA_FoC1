
package Lec5Loop_Exercise;
import java.util.Scanner;

public class Ex2_MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Int Number 2 to 9: ");
        int number = scanner.nextInt();
        for (int i = 1 ; i <= 10; i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
        
    }
}
