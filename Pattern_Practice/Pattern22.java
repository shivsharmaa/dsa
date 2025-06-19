package demo;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row=1, nst=n, nsp=0;
		
		while(row<=n) {
			int count=1;
			int csp=0;
			
			int cst=0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
				
			}
			
			System.out.println();
			nsp++;
			row++;
			nst--;
		}
	}

}
