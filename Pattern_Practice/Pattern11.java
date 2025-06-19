package demo;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(), row =1, nst = 1, nsp=n-1;
		
		while(row<=n) {
			int csp=0;
			while(csp<nsp) {
				System.out.print(" ");
				
				
				csp++;
			}
			int cst=0;
			while(cst<nst) {
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
