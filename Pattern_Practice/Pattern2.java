package demo;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("pleae provide no. of star");
		int n=sc.nextInt();
		int nst = n;
		
		int row = 1;
		
		while(row<=n) {
			int cst = 0;
			
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			
			}
			System.out.println();
			
			nst--;
			row++;
		}

	}

}
