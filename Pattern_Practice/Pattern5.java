package demo;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("pleae provide no. of star");
		int n=sc.nextInt();
		int row = 1;
		int nst = n;
		int nsp = 1;
		
		while(row<=n) {
//			for space
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
//			for star
			int cst=0;
			while(cst < nst) {
				System.out.print("* ");
			cst++;
			}
			
			System.out.println();
	
//			 Question 6
//			nsp+=2;
			nsp++;
			nst--;
			row++;
		}

	}

}
