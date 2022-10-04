import java.util.Scanner;
public class ProfitCalculator{
	
	public static double profitOffTop(double costToBuild, double sellingPrice) {
		double profit = 100 * (sellingPrice - costToBuild) / costToBuild;
		return profit;
	}
	
	public static double profitOffBottom(double costToBuild, double sellingPrice) {
		double profit = 100 * (sellingPrice - costToBuild) / sellingPrice;
		return profit;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the cost to build and selling price seperated by spaces:");
		double costToBuild = input.nextDouble();
		double sellingPrice = input.nextDouble();
		double profitTop = profitOffTop(costToBuild, sellingPrice);
		double profitBottom = profitOffBottom(costToBuild, sellingPrice);
		
		String bottomProfit = "The profit off the bottom is";
		String topProfit = "The profit off the top is";
		
		System.out.printf("%s %.1f%%.\n", topProfit, profitTop);
		System.out.printf("%s %.1f%%.\n", bottomProfit, profitBottom);
	}
}
