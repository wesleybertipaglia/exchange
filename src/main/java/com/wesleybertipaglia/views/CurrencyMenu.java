package com.wesleybertipaglia.views;

import java.util.Scanner;
import com.wesleybertipaglia.controllers.CurrencyController;

public class CurrencyMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CurrencyController currencyController = new CurrencyController();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            String choice = scanner.nextLine();
            handleChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("-------------------------------------");
        System.out.println("\n💱 CURRENCY CONVERSION MENU\n");
        System.out.println("-------------------------------------");
        System.out.println("1. Convert currency");
        System.out.println("0. Exit");
        System.out.print("\nChoose an option: ");
    }

    private static void handleChoice(String choice) {
        switch (choice) {
            case "1" -> convertCurrency();
            case "0" -> exitProgram();
            default -> System.out.println("\n⚠️ Invalid option. Please try again.");
        }
    }

    private static void convertCurrency() {
        System.out.print("\nEnter source currency (e.g., USD): ");
        String from = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency (e.g., EUR): ");
        String to = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount: ");
        double amount;

        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid amount. Please enter a valid number.");
            return;
        }

        double result = currencyController.convertCurrency(from, to, amount);
        if (result >= 0) {
            System.out.printf("✅ %.2f %s = %.2f %s\n", amount, from, result, to);
        } else {
            System.out.println("❌ Conversion failed. Please check the currency codes or try again later.");
        }
    }

    private static void exitProgram() {
        System.out.println("\n👋 Exiting... Goodbye!");
        scanner.close();
        System.exit(0);
    }
}
