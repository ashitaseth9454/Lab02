package question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("Zero");
        } else if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        scanner.close();
    }
}
