
import java.util.Scanner;
public class CalculatePrice{
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the unit price of the item $");
		double price = input.nextDouble();
		System.out.print("Enter the number you wish to purchase: ");
		int quantity = input.nextInt();
		
		double subtotal = price * quantity;
		double tax = subtotal * .0750;
		double total = subtotal + tax;
		
		System.out.printf("Subtotal: $%.2f\n", subtotal);
		System.out.printf("Tax at 7.50%%: %.2f\n", tax);
		System.out.printf("Total: $%.2f\n", total);
	}
}
