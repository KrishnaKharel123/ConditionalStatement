import java.util.Scanner;

public class WeekName15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   ///object name scanner to read user input
        System.out.println("Enter the number between 1 to 7");
        int num = scanner.nextInt();    ////read and store user input
        displayDay(num);               ////method to display the corressponding day

    }

    public static void displayDay(int num) {      ////method to display the day of the week
        switch (num) {
            case 1:

                System.out.println("The day is Monday ");
                break;

            case 2:

                System.out.println("The day is Tuesday ");
                break;

            case 3:

                System.out.println("The day is Wednesday ");
                break;

            case 4:

                System.out.println("The day is Thursday ");
                break;

            case 5:

                System.out.println("The day is Friday");
                break;

            case 6:

                System.out.println("The day is Saturday");
                break;

            case 7:

                System.out.println("The day is  Sunday");
                break;

            default:
                System.out.println("Invalid Entry");


        }
    }
}
