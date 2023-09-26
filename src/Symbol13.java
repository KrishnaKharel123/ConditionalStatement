import java.util.Scanner;

public class Symbol13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     //// object name scanner to read user input

        System.out.println("Enter First Number ");          ////user to store number
        int num1 = scanner.nextInt();

        System.out.println("Enter Second Number ");
        int num2 = scanner.nextInt();///

        System.out.println("Enter any of these Symbols +,-,/,*  ");
        char symbol = scanner.next().charAt(0);
        calculation(num1, num2, symbol);        ////method calculate based on user input
    }

    public static void calculation(int num1, int num2, char symbol) {   ///method to calculate and print the result
        switch (symbol) {
            case '+':

                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':

                System.out.println(num1 / num2);
                break;
            case '*':

                 System.out.println(num1 * num2);


        }

    }
}
