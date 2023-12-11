import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        String str = "aaaaabbbbbcccccdddddeeeeefffff";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự cần đếm: ");
        char targetChar = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự '" + targetChar + "' trong chuỗi là: " + count);
    }
}
