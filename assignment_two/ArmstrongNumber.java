package assignment_two;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n, temp1=n;
		long sum=0;
		int count=0;
		
		while(temp>0) {
			
			count++;
			temp = temp /10;
			
		}
		
		while(temp1>0) {
			long rem = temp1 % 10;
			sum = sum + (long) Math.pow(rem, count);

			temp1 = temp1/ 10;
		}
		
		if(n==sum) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
