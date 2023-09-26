import java.util.Scanner;

public class InterchnagedValue5
{
    public static void main(String[] args)
    {
        int a,b,temp;
        Scanner scanner = new Scanner(System.in);  ////allows user to input data

        System.out.println("Give value to A");   ///
        a=scanner.nextInt();
        System.out.println("Give value to B");
        b=scanner.nextInt();

        temp=a;                ////temp variables
        a=b;
        b=temp;

        System.out.println("\nB="+b);
        System.out.println("\nA="+a);




    }












}























