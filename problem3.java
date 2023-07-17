import java.util.Scanner;

class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the target number (x): ");
        int x = scanner.nextInt();

        while (a <= x) {
            System.out.print(a + " ");
            a++;
        }

        scanner.close();
    }
}
