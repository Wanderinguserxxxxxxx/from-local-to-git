//Sum of two numbers by taking user input
package localRepo;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;

            System.out.println("The sum of " + num1 + " + " + num2 + " is " + sum);
        }

    }
}
