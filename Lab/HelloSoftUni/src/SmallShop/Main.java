package SmallShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (city) {
            case "Sofia":

                if ("coffee".equals(product)) {
                    price = 0.50;
                } else if ("water".equals(product)) {
                    price = 0.80;
                } else if ("beer".equals(product)) {
                    price = 1.20;
                } else if ("sweets".equals(product)) {
                    price = 1.45;
                } else if ("peanuts".equals(product)) {
                    price = 1.60;
                }
                break;

            case "Plovdiv":

                if ("coffee".equals(product)) {
                    price = 0.40;
                } else if ("water".equals(product)) {
                    price = 0.70;
                } else if ("beer".equals(product)) {
                    price = 1.15;
                } else if ("sweets".equals(product)) {
                    price = 1.30;
                } else if ("peanuts".equals(product)) {
                    price = 1.50;
                }
                break;

            case "Varna":

                if ("coffee".equals(product)) {
                    price = 0.45;
                } else if ("water".equals(product)) {
                    price = 0.70;
                } else if ("beer".equals(product)) {
                    price = 1.10;
                } else if ("sweets".equals(product)) {
                    price = 1.35;
                } else if ("peanuts".equals(product)) {
                    price = 1.55;
                }
                break;

        }
        System.out.println(amount * price);
    }
}
