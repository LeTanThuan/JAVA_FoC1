package Lec6_ArayList;

import java.util.ArrayList;
import java.util.Scanner;
public class Ex6_UnlimitedDataEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> danhSachSo = new ArrayList<>();
        int soNhap;

        System.out.println("Enter Number Int (Enter -1 to Break!)");

        while (true) {
            System.out.print("Enter Number: ");
            soNhap = scanner.nextInt();

            if (soNhap == -1) {
                break; 
            }

            danhSachSo.add(soNhap); 
        }


        int sum = 0;
        for (int so : danhSachSo) {
            sum += so;
        }

        
        System.out.println("The numbers entered are : " + danhSachSo);
        System.out.println("The sum of the numbers is: " + sum);
    }
}
