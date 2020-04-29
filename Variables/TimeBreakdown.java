
public class TimeBreakdown {

	public static void main(String[] args) {
		//Declare a value to be modified and a value for the true initial value to print later
		int initialValue = 2693793;
		int trueInitialValue = 2693793;
		
		// There are 86400 seconds in one day, therefore dividing the seconds value by 86400 yields the day count
		// Use % operator to determine what's leftover
		int daysValue = initialValue / 86400;
		initialValue = initialValue % 86400;

		// There are 3600 seconds in one hour, then use % operator
		int hoursValue = initialValue / 3600;
		initialValue = initialValue % 3600;

		//There are 60 seconds in one minute and then use % operator
		int minutesValue = initialValue / 60;
		initialValue = initialValue % 60;
		
		//The initial value is now what is left in seconds, so set the secondsValue to initialValue
		int secondsValue = initialValue;
		
		// print all the values
		System.out.println("A time of " + trueInitialValue + " seconds is equivalent to");
		System.out.println("  " + daysValue + " day(s)");
		System.out.println("  " + hoursValue + " hour(s)");
		System.out.println("  " + minutesValue + " minute(s)");
		System.out.println("  " + secondsValue + " second(s)");
	}

}
