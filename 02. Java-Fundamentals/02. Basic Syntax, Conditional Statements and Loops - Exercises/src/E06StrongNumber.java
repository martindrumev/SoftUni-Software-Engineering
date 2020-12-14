import java.util.Scanner;

public class E06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - 48;

            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }
            total += fact;
        }
        int inputNum = Integer.parseInt(input);
        if (total == inputNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}