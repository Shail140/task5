import java.util.Scanner;

public class Main {

    public static void printMain(int h) {
        if (h < 3) {
            System.out.println("h >= 3");
            return;
        }
        System.out.println("*");

        for (int i = 2; i < h; i++) {
            System.out.print("|");
            for (int j = 0; j < i - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
        System.out.print("*");
        for (int i = 0; i < h - 2; i++) {
            System.out.print("-");
        }
        System.out.println("*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите h (h >= 3): ");
        int h = scanner.nextInt();

        printMain(h);

        scanner.close();
    }
}
//pull request не робит(