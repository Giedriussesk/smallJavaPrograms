import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        final int monthsInYear = 12;
        final int percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual interest rate: ");
        double annualInterestPercent = scanner.nextDouble();

        System.out.println("Period in years: ");
        int years = scanner.nextInt();

        double monthlyInterest = annualInterestPercent / percent / monthsInYear;
        int numberOfPayments = years * monthsInYear;

        double mortgage;
        if (monthlyInterest == 0) {
            mortgage = (double) principal / numberOfPayments;


        } else {
            double pow = Math.pow(1 + monthlyInterest, numberOfPayments);
            double numerator = monthlyInterest * pow;
            double denominator = pow - 1;
            mortgage = principal * (numerator / denominator);

        }
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close();

    }
}


