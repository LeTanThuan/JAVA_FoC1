
package Lec4_Exercise;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Old: ");
        int old = scanner.nextInt();
        if (old <= 12){
            System.out.print("Child");
        }else if ((12 < old) && (old < 20)){
            System.out.println("Teenager");
        }else if ((20 <= old) && (old <=59)){
            System.out.println("Adult");
        }else if (60<= old){
            System.out.println("Senior");
        }
       
    }
}
