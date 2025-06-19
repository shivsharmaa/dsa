package demo;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(), row =1, nst = 1;
		
		while(row <=2* n - 1) {
			
			int cst = 0;
			
			while(cst<nst) {
				System.out.print("* ");
			cst++;
			}

			
			System.out.println();
			if(row<n) {
				nst++;
			}else {
				
				nst--;
			}
			row++;
	}

	}
}
