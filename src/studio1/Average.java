package studio1;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is the first of two integers to be averaged?");
		int n1 = in.nextInt();
		
		Scanner in1 = new Scanner (System.in);
		System.out.println("What is the second of two integers to be averaged?");
		int n2 = in1.nextInt();
		
		System.out.println((n1 + n2)/2.0);
		
		

	}

}
