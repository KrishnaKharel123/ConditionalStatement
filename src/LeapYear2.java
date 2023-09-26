import java.util.Scanner;

public class LeapYear2
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);   ////create a scanner to read use

        System.out.print("Enter a Year:");     //// user to enter a year

        int year = scanner.nextInt();


        if (year% 4 == 0 && year% 100 != 0)     /////check if its a leap year if divivided by 4 but not by 100
        {
            System.out.println(year + " is a leap year");

        }
        else if (year% 400 ==0)      //////check if its dividided 400 then it leap year
        {
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year ");

        }








    }
}