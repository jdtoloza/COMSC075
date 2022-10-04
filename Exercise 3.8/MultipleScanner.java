import java.util.Scanner;
public class MultipleScanner{
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter degrees, minutes, and seconds seperated by spaces: ");
		int degrees = input.nextInt();
		int minutes = input.nextInt();
		int seconds = input.nextInt();
		
		System.out.printf("You put in %d degrees, %d minutes, and %d seconds\n", degrees, minutes, seconds);
	}
}
