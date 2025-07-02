package assignment_two;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int digit = n % 2;
			sum = digit * mul + sum;
			
			n=n/2;
			mul=mul * 10;
		}
		System.out.println(sum);
	}
}
