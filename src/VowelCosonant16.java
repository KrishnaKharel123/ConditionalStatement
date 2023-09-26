import java.util.Scanner;

public class VowelCosonant16 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   ///scanner object named scanner to read

        System.out.println("Enter a Character");
        char character = scanner.next().charAt(0);   ///user input as a string to input
        recogniseCharacter(character);


    }

    public static void recogniseCharacter(char character) {
        switch ( character)          ///Starts switch statement to check the value of character variable
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println("The character is vowel");
                break;

            default:
                System.out.println("It is a consonant ");

        }

    }
}
