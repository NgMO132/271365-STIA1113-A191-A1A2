
/**
 * assignment
 */
import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double CarPrice, DownPayment, InterestRate, Principal, Interest, MonthlyRepayment, Balance;
        int LoanPeriod;
        double totalPrincipal = 0, totalInterest = 0;
        double totalLoanPayment = 0;
        int i = 1;

        do {
            System.out.println("Enter Car Price(RM):");
            CarPrice = scan.nextDouble();
        } while (CarPrice < 30000);
        do {
            System.out.println("Enter Down Payment(RM):");
            DownPayment = scan.nextDouble();
        } while (DownPayment < 0);
        do {
            System.out.println("Enter Loan Period(Years):");
            LoanPeriod = scan.nextInt();
        } while (LoanPeriod < 5 || LoanPeriod > 9);
        do {
            System.out.println("Enter Interest Rate(%):");
            InterestRate = scan.nextDouble();
        } while (InterestRate < 3 || InterestRate > 7);

        Interest = (CarPrice - DownPayment) * InterestRate / 100;
        System.out.println();

        Principal = (CarPrice - DownPayment) / LoanPeriod + Interest;

        MonthlyRepayment = Principal / 12;
        System.out.print("Monthly Repayment = " + "RM");
        System.out.printf("%.2f\n\n", MonthlyRepayment);

        totalLoanPayment = (CarPrice - DownPayment) + (Interest * LoanPeriod);

        System.out.printf("%-5s%20s%20s%20s\n", "Years", "Principal(RM)", "Interest(RM)", "Balance(RM)");
        do {
            totalPrincipal += Principal;
            totalInterest += Interest;
            Balance = totalLoanPayment - totalPrincipal;
            System.out.printf("%-5s%20.2f%20.2f%20.2f\n", i + "th", totalPrincipal, totalInterest, Balance);
            i++;
        } while (i <= LoanPeriod);

    }
}
