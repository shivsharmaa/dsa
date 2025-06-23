package demo;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt(), row=1, nst=n, nsp=n-1;
		
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
			csp++;
			}
			
			int cst = 1;
			
			while(cst<=nst) {
				if(row==1 || row==n || cst == 1 || cst == n) {
					
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				cst++;
			}
			
			System.out.println();
			
			nsp--;
			row++;
		}
	}

}
