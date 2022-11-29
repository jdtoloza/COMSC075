

import java.util.Scanner;

public class Sales2d {
	
	public static void main (String[] args) {
		final int BASE_YEAR = 2019;
		
		double[][] sales = {
			{10, 11, 12, 13},
			{14, 15, 16, 17},
			{18, 19, 20, 21}
		};
		
		/* For each row, set the yearly total to zero
		 * - within the row, add up all the items in that row
		 * - print the yearly total
		 */
		 
		 for (int row = 0; row < sales.length; row++) {
			double yearlyTotal = 0;
			for (int col = 0; col < sales[row].length; col++) {
				yearlyTotal = yearlyTotal + sales[row][col];
			}
			System.out.printf("Yearly sales for %d: $%.1f K%n",
				BASE_YEAR + row, yearlyTotal);
		}
		/*
		 * For quarterly totals, we need to go through each column, 
		 * and set the quarterlyTotal to zero. Then proceed through each
		 * row in that column and add it to the total. 
		 */
		 
		 int nQuarters = sales[0].length; // presume all rows have same length
		 
		 for (int col = 0; col < nQuarters; col++) {
			 double quarterlyTotal = 0.0;
			 for (int row = 0; row < sales.length; row++) {
				 quarterlyTotal = quarterlyTotal + sales[row][col]; // row is always the first index!!
			 }
			 System.out.printf("Sales for Q%d: $%.1f K %n", (col + 1), quarterlyTotal);
		 }
		 
		 double grandTotal = 0.0;
		 for (int year = 0; year < sales.length; year++) {
			 for (int quarter = 0; quarter < sales[year].length; quarter++) {
				 grandTotal += sales[year][quarter];
			 }
		 }
		 System.out.printf("Grand total for %d-%d: $%.1f K%n", BASE_YEAR, BASE_YEAR + sales.length - 1, grandTotal);
	}
}

