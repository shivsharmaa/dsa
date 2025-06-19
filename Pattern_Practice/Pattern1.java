package demo;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pleae provide no. of star");
		int n=sc.nextInt();
		int nst = n;
		
		int row = 1;
		
		while(row<=nst) {
			int cst = 0;
			
			while(cst<row) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
