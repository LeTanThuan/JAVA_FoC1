import java.util.Scanner;

public class Ex3_StringCompression {

    public static String compress(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        // Duyệt từ ký tự thứ 2 trở đi
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++; // nếu giống ký tự trước → tăng đếm
            } else {
                // nếu khác → ghi lại ký tự và số lần, rồi reset
                compressed.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        // Ghi lại ký tự cuối cùng
        compressed.append(currentChar).append(count);

        return compressed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần nén: ");
        String input = scanner.nextLine();

        String output = compress(input);
        System.out.println("Chuỗi sau khi nén: " + output);
    }
}