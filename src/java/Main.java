package src.java;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int option;
        try(Scanner scanner = new Scanner(System.in)) {

        do

            {
                System.out.println("Menu:");
                System.out.println("1. Two sum ");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("That's not a valid option! Please enter a number.");
                    scanner.next();
                }
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("You chose two sum -> ");
                    case 4:
                        System.out.println("Exiting...");
                    default:
                        System.out.println("Invalid choice! Please choose a valid option.");
                }
            } while(option !=4);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

    }
}
