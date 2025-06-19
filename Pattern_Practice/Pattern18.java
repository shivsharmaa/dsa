package demo;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(), row =1, nst = 1, nsp=n-1;
		
		while(row <=2*n-1) {
			
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
			csp++;
			
			}
			int cst =0;
			while(cst<nst){
				System.out.print("* ");
				cst++;
			}

			System.out.println();
			if(row<n) {
				nsp--;
				nst+=2;
			}else {
				nsp++;
				nst-=2;
			}

		row++;
		}

	}
}
