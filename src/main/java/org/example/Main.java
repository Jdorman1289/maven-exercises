package org.example;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String input = scanner.nextLine();

        System.out.printf("You Entered: %s%n", input);

//        if (StringUtils.isNumeric(input)) {
//            System.out.println("\"" + input + "\" is a number");
//        } else {
//            System.out.println("\"" + input + "\" is not a number");
//        }
//
//        String flippedCase = StringUtils.swapCase(input);
//        System.out.println("Flipped Case: " + flippedCase);
//
//        String reversed = StringUtils.reverse(input);
//        System.out.println("Reversed: " + reversed);
    }
}