package assignment_two;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		int count=0;
		while(N1>0) {
			int rem= N1%10;
			if(rem==N2) {
				count++;
			}
				N1 = N1/10;
			
		}
		
		System.out.println(count);
	}
}
