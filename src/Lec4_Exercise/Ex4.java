package Lec4_Exercise;

import java.util.Scanner;
public class Ex4 {
    public static void SimpleCalculator(int x, int y, String operator){
        switch(operator){
            case "+" : int sum= x + y;
                       System.out.println(x+" + "+y+" = "+ sum);
                       break;
            case "-" : int sub= x - y;
                       System.out.println(x+" - "+ y+" = "+sub);
                       break;
            case "*": int avg = x * y;
                      System.out.println(x+" * "+y+" = "+avg);
                      break;
            case "/": if (y != 0){
                        float div= x/y;
                        System.out.println(x+" / "+y+" = "+div );
                      }else{
                            System.out.println("Errol!");
                      }
            default : System.out.println("Errol"); break;    
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number A: ");
        int a = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int b = scanner.nextInt();
        System.out.print("Enter Operator (+ - * /): ");
        String Operator = scanner.next();
        SimpleCalculator(a,b,Operator);
        
    }
}
