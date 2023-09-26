import java.util.Scanner;

public class Salary6
{


    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);  ///object name scanner to read user input
        System.out.println("Enter Employee ID ");
        int id =scanner.nextInt();

        System.out.println("Enter Employee Name ");
        String name= scanner.next();

        System.out.println("Enter Employee Basic Salary ");
        double salary = scanner.nextDouble();
        salaryCalc(salary);


    }
    public static void salaryCalc(double salary)
    {
         double HRA, TA, DA, PF,  Grosssalary;   ////variables of salary components and Gross
         HRA = salary * 10/100;        ////calculate hOUSE RENT
         TA = salary * 9/100;          ////calculate TRAVEL ALLOWANCE
         DA = salary * 8/100;         ////calculate DEARNESS ALLOWANCE
         PF = salary * 20/100;        ////calculate PROVIDENT FUND
         Grosssalary = salary + HRA + TA + DA - PF;  ///Calculate Gross salary
        System.out.println("The Gross Salary is "  +Grosssalary); ///Display the calculated Gross


    }
}
