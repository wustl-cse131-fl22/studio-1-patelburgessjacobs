package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year were you born?");
		int year = in.nextInt();
		
		boolean divByFour = (year % 4 == 0);
		boolean divByHund = (year % 100 != 0);
		boolean divByFoHundo = (year % 400 == 0);
		
		boolean isLeapYear = ((divByFour && divByHund) || divByFoHundo);
		System.out.println(year + " is a leap year: " + isLeapYear);
				
		
	}

}
