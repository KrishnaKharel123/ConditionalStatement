import java.util.Scanner;

public class Marksheet3
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        int rollNo;                                       ///Variable name
        double mathsmarks, sciencemarks, englishmarks;
        double totalmarks, percentage;
        String result, grade;


        System.out.println("Student name");     ///Input student information
        name = scanner.nextLine();
        System.out.println("roll number");
        rollNo = scanner.nextInt();
        System.out.println("marks for maths");
        mathsmarks = scanner.nextDouble();
        System.out.println("marks for science");
        sciencemarks = scanner.nextDouble();
        System.out.println("marks for english");
        englishmarks = scanner.nextDouble();

        totalmarks = mathsmarks + sciencemarks + englishmarks;
        percentage = (totalmarks / 300) * 100;



          if (percentage >= 35) {   ////Determine the result
              result = "Pass";
          }else {
              result ="Fail";




        }
        if (percentage >= 80)      ////Determine the grade
        {
            grade = "A+";
        } else if (percentage >= 60)
        {
            grade = "A";
        }
        else
            if (percentage >= 50)
        {
            grade = "B";
        }
        else
            if (percentage >=35) {

                grade = "c";
            }
            else {
                grade = "F";
            }


        System.out.println("student name:"  + name);  ///Display Student information,result and graade
        System.out.println("roll number:" +rollNo);
        System.out.println("total marks:"+ totalmarks);
        System.out.println("percentage:"+ percentage + "%");
        System.out.println("Result:" +result );
        System.out.println("Grade:"  +grade);

    }














}

















