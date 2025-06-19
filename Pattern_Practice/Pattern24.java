package demo;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), row=1, nst=1, nsp=n-1;
		
		while(row<=n) {
			int csp=0;
			
			while(csp<nsp) { 
				System.out.print("  ");
				
				
				csp++;
			}
			int cst=0;
			while(cst<nst) {
				System.out.print(row+" ");
				cst++;
			}
			
			System.out.println();
			nsp--;
			row++;
			nst+=2;
		}
	}

}
