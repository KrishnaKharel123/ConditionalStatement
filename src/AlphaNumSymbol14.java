import java.util.Scanner;

public class AlphaNumSymbol14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any  Value: ");

        char value = scanner.next().charAt(0);
        characterRecognition(value);
    }

    public static void characterRecognition(char value) {
        if( (value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z'))
        {
            System.out.println("This is an Alphabhet");
        } else if (value >= '0' && value<= '9') {
            System.out.println("This is a number");

        }
        else
            System.out.println("This is a symbol");

    }
}