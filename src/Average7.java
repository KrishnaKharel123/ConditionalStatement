import java.util.Scanner;

public class Average7
{

    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);  ///Create a Scanner object for user input
        double a,b,c,d,e;                          ////declare variables
        System.out.println("Enter any five Numbers");  ////promt the user to enter numbers

        a= scanner.nextDouble();
        b= scanner.nextDouble();
        c= scanner.nextDouble();
        d= scanner.nextDouble();
        e= scanner.nextDouble();

        double sum =a+b+c+d+e; //////calculate the sum of five numbers
        double average =sum/5;  //////calculate the avearage dividing sum by 5

        System.out.println( "The average of "  +a+ " + "  +b+ " + "  +c+ " + "  +d+ " + "   +e+  " = "  +average  )  ;









    }









}
