
package Lec4_Exercise;
import java.util.Scanner;
public class Ex5_DayoftheWeek {
    public static void DayofWeek(int day){
        switch (day){
            case 1 : System.out.println("SunDay"); break;
            case 2 : System.out.println("MonDay"); break;
            case 3 : System.out.println("TuesDay"); break;
            case 4 : System.out.println("WednesDay"); break;
            case 5 : System.out.println("ThursDay"); break;
            case 6 : System.out.println("FriDay"); break;
            case 7 : System.out.println("SaturDay"); break;
            default : System.out.println("error message");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1->7: ");
        int day=scanner.nextInt();
        DayofWeek(day);
    }
}
