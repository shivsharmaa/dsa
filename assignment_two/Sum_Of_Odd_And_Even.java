package assignment_two;

import java.util.Scanner;

public class Sum_Of_Odd_And_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int oddSum=0;
		int evenSum=0;
		int count = 0;
		
		while(n>0) {
			
			
			int digit = n % 10;
			if(count%2==0) {
				evenSum=digit + evenSum;
			}else {
				oddSum = digit + oddSum;
			}
			
			
			n = n/10;
			count++;
		}
		
		System.out.println(evenSum);
		System.out.println(oddSum);
		
		
		
		
	}

}
