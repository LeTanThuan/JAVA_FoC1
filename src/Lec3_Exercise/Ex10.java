package Lec3_Exercise;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    scanner.useDelimiter("##");
    System.out.println("Enter words separated by '##': ");
    while (scanner.hasNext()) {
        System.out.println(scanner.next());
    }
    scanner.close();
    }
}
