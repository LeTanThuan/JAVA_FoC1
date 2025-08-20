
package Lec4_Exercise;

import java.util.Scanner;

public class Ex6_AcademicGrading {
    public static void Granding(float avg){
        if ((9 <= avg) && (avg <=10)){
            System.out.println(avg+" Excellent");
        }else if ((8.0 <= avg) && (avg <= 8.9)){
            System.out.println(avg+" Good");
        }else if ((6.5 <= avg)&& (avg <= 7.9)){
            System.out.println(avg+" Fair");
        }else if ((5.0 <= avg) && (avg <= 6.4)){
            System.out.println(avg+" Average");
        }else{
            System.out.println(avg+" Fail");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an average: ");
        float avg = scanner.nextFloat();
        Granding(avg);
    }
}
