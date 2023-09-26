import java.util.Scanner;

public class SalesCommission9 {
    public static void main(String[] args) {
        double commission;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller ID ");
        int id = scanner.nextInt();

        System.out.println("Enter Seller Name ");
        String name = scanner.next();

        System.out.println("Enter Sales Amount");
        double sales = scanner.nextDouble();

        System.out.println("Enter Basic Salary");
        double salary = scanner.nextDouble();


        if (sales >= 50000) {
            commission = (sales * 0.35);
            System.out.println(" The Commission is " + commission); //

        } else if (sales >= 30000) {
            commission= (sales * 0.20); //
            System.out.println("The Commission is " + commission); //

        } else if (sales >= 20000) {
            commission = (sales * 0.10);
            System.out.println("The commission is " + commission); //
        } else if (sales >= 10000) {
            commission = (sales * 0.05);
            System.out.println("The commission is " + commission);//
        } else if (sales < 10000) {
            commission = (sales * 0.02);
            System.out.println(" The commission is " + commission);//

        }

    }
}
