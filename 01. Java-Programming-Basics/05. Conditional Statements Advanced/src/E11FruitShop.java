import java.util.Scanner;

public class E11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double price = 0.00;

        switch (day) {
            default:
                System.out.println("error");
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = 2.50 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "apple":
                        price = 1.20 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "orange":
                        price = 0.85 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapefruit":
                        price = 1.45 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "kiwi":
                        price = 2.70 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "pineapple":
                        price = 5.50 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapes":
                        price = 3.85 * amount;
                        System.out.printf("%.2f", price);
                        break;

                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = 2.70 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "apple":
                        price = 1.25 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "orange":
                        price = 0.90 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapefruit":
                        price = 1.60 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "kiwi":
                        price = 3.00 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "pineapple":
                        price = 5.60 * amount;
                        System.out.printf("%.2f", price);
                        break;
                    case "grapes":
                        price = 4.20 * amount;
                        System.out.printf("%.2f", price);
                        break;

                    default:
                        System.out.println("error");
                        break;
                }
        }
    }
}
