package assignment_two;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int divisor = sc.nextInt();
		int dividend = sc.nextInt();
		
		while(divisor>0) {
			int rem = dividend % divisor;
			
			dividend = divisor;
			divisor = rem;
			
		}
		
		System.out.println(dividend);
	}
}
