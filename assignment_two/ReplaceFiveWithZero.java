package assignment_two;

import java.util.Scanner;

public class ReplaceFiveWithZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if (n == 0) {
            System.out.println(5);
            return;
        }

		long sum = 0;
		long mul = 1;
       
		while(n>0) {
			 long rem = n % 10;
			if(rem==0) {
				rem = 5;
			}
			
			sum = sum + rem*mul;
			mul = mul * 10;
			n = n/10;
		}
		System.out.println(sum);
	}
}
