package demo;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row=1, nst=1, nsp=1;
		
		while(row<n) {
			int csp =0;
			
			
			int cst=0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			nst++;
			nsp++;
			row++;
		}
		
	}

}
