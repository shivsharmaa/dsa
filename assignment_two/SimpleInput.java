package assignment_two;

import java.util.Scanner;

public class SimpleInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0, count=1;
		while(true) {
			
			int n = sc.nextInt();
			sum=sum+n;
			if(n<0) {
				break;
			}
			System.out.println(sum);
		
		}
	}
}
