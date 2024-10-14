package ie.atu.exceptions;
import java.util.Scanner;

public class TemperatureArray {
    public static void main(String[] args) {
        int[] temperatures = {20, 22, 19, 23, 21, 18, 25};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        try{
            System.out.println("Temperature for day " + day + ": " + temperatures[day - 1]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day number. Please enter a number between 1 and 7");
        }
        }
    }
    

