/*
 * Purpose: To calculate the future investment value
 * Revision History: 12/09/2023
 */
import java.util.Scanner;
/**
 * 
 */
public class RMistryAssignment4 {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter amount of investment: ");
		double investment = input.nextDouble();
		
		System.out.print("Enter annual interest rate: ");
		double AnnualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		
		double MonthlyInterestRate=AnnualInterestRate / 100 / 12;
		double futureInvestmentValue = investment * Math.pow((1 + MonthlyInterestRate), (years * 12));
		System.out.printf("Future investment value is: $%.2f\n", futureInvestmentValue);
	}

}
