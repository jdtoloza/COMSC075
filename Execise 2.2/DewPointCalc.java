public class DewPointCalc{
	
	public static void main (String[] args) {
		double temperature = 17;
		double relHumidity = 30;
		
		double dewPoint = temperature - ((100 - relHumidity) / 5);
		System.out.printf("For air temperature of %.1f degrees Celsius \n", temperature);
		System.out.printf("and relative humidity of %.1f%% \n", relHumidity);
		System.out.printf("The dew point is %.1f degrees Celsius \n", dewPoint);
	}
}
