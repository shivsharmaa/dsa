package assignment_two;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
		
	}
}
