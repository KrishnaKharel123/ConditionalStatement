import java.util.Scanner;

public class CityNameSwitch10
{



    public static void main(String[] args)
    {


        Scanner scanner= new Scanner(System.in);       ////Scanner object read user input

        System.out.println("Input any Alphabet from A to F");   ////user to input any character
        char cityName = scanner.next().charAt(0);               ///method and passes the extacted character
        nameofcity(cityName);

    }
 public static void nameofcity(char cityName)     ////method which take character as argument
 {
     switch (cityName)                           /////switch statement checks the value of city name against different cases
     {
         case 'A':
         case 'a':

             System.out.println("The name of the city is Aberdeen");
             break;

         case 'B':
         case 'b':
             System.out.println("The name of the city is Budapest");
             break;
         case 'C':
         case 'c':

             System.out.println("The name of the city is Calcutta");
             break;
         case 'D':
         case 'd':

             System.out.println("The name of the city is Delhi");
             break;
         case 'E':
         case 'e':

             System.out.println("The name of the city is England");
             break;
         case 'F':
         case 'f':

             System.out.println("The name of the city is FieldEnd");
             break;

         default:
             System.out.println("Invalid Entry");


     }
 }




}
