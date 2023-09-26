import java.util.Scanner;

public class OddEven1
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);     ///scanner object to read user input
        System.out.println("Enter First Number : "); ///prompts the user to enter the first number
        int x = sc.nextInt();          ////it reads the first number and stores it in the vaiable y

        System.out.println("Enter Second Number : ");  ///prompts the user to enter the first number
        int y = sc.nextInt();                           ////it reads the first number and stores it in the vaiable y

        String answer = (x %2 ==0) ? "Even Number" : "Odd Number";  ///to determine x using ternary number
        String answer1 = (y %2 ==0) ? "Even Number" : "Odd Number";   ///to determine y using ternary number
        System.out.println( "The Number " + x + " = " +answer);
        System.out.println( "The Number " + y + " = " + answer1);


    }

}
