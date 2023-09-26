import java.util.Scanner;

public class PassFail4 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name");
        String name = scanner.nextLine();
        System.out.println("roll number");
        int rollNo = scanner.nextInt();
        System.out.println("marks for maths");
        double mathsmarks = scanner.nextDouble();
        System.out.println("marks for science");
        double sciencemarks = scanner.nextDouble();
        System.out.println("marks for english");
        double englishmarks = scanner.nextDouble();
        passFail(mathsmarks, sciencemarks, englishmarks);

    }

    public static void passFail(double mathsmarks, double sciencemarks, double englishmarks) {
        if (mathsmarks >= 35 && sciencemarks >= 35 && englishmarks >= 35) {


            System.out.println("Student has passed");
        } else
            System.out.println("Student has failed");


    }

}












