package demo;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("pleae provide no. of star");
		int n=sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		
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
			
			nst++;
			nsp--;
			row++;
		}

	}

}
