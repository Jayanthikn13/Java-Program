import java.util.Scanner;

class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target number (x): ");
        int x = scanner.nextInt();

        int a = 1;

        while (a <= x) {
            System.out.print(a + " ");
            a += 2;
        }

        scanner.close();
    }
}
