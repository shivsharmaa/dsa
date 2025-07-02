package assignment_two;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int lcm = 0;
		int divisor = n1;
		int dividend = n2;
		
		while(divisor>0) {
			int rem = dividend % divisor;
			
			dividend = divisor;
			divisor = rem;
			
		}
		
		lcm = (n1*n2)/(dividend);
		System.out.println(lcm);
		
	}
}
