//Sum of two numbers by taking user input
//Now can give the product of two numbers
package localRepo;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            sc.nextLine();
            int sum = num1 + num2;
            int product = num1 * num2;

            System.out.println("\'S\' for sum \'P\' for product");
            String input = sc.nextLine().toUpperCase();
            switch (input) {
                case "S":
                    System.out.println("The sum of " + num1 + " + " + num2 + " is " + sum);
                    break;
                case "M":
                    System.out.println("The product of " + num1 + " X " + num2 + " is " + product);
                    break;
                default:
                    System.out.println("Enter valid input");
                    break;
            }

        }

    }
}
