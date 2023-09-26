import java.util.Scanner;

public class PositiveNegative8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  ///read user input from the console
        int number;        ////Declare variable


        System.out.println("Enter a number");
        number = scanner.nextInt();     ////input as integer and store in number variable
        positiveNegative (number);

    }

    public static void positiveNegative(int number) {   ////define positivenegative method
        if (number > 0)
            System.out.println("The number is positive ");

        else if (number < 0) {
            System.out.println("The number is negative");
        }
        else
            System.out.println("The number is zero");
    }
}
