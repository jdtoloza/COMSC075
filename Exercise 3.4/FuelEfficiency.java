import java.util.Scanner;
public class FuelEfficiency{
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter miles per kilowatt-hour: ");
		double kwh = input.nextDouble();
		
		double kwhkm = 100 / 1.609344 / kwh;
		
		System.out.printf("That is equivalent to %.2f kWh/100km. \n", kwhkm);
	}
}
