package Lec3_Exercise;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name:");
        String name=scanner.nextLine();
        
        System.out.println("Enter Age:");
        int age= scanner.nextInt();
        System.out.println("Hello "+ name+", you are "+age+" year old");
    }
}
