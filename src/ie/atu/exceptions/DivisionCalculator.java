package ie.atu.exceptions;

import java.util.Scanner;

public class DivisionCalculator {
    
    public static void main(String[] args) {
        int numbers ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number ");
        int num2 = scanner.nextInt();

       // int day = scanner.nextInt();

        try{
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e) {
            System.out.println("Cannot be divide by zero");
        } finally {
            System.out.println("Calculation completed.");
        } 
        }
        }


