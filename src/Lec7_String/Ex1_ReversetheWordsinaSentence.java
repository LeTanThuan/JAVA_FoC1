package Lec7_String;

import java.util.Scanner;

public class Ex1_ReversetheWordsinaSentence {

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input text: ");
        String input = scanner.nextLine();

        String output = reverseWords(input);
        System.out.println("after inverting the text: " + output);
    }
}
