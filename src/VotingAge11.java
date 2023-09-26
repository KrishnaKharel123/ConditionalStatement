import java.util.Scanner;

public class VotingAge11
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); ///object name scanner to read user input

        System.out.println("Enter the age");

        int age = scanner.nextInt();          ////user to enter the age
        votingAge(age);                        /////method with age as an argument


    }
    public static void votingAge(int age)
    {
       if(age>=18) {
           System.out.println("This person is eligible to vote");  ////print a message if the condition is true
       }
       else
           System.out.println("This person is not eligible to vote");  /////message for ineligibility
    }
}
