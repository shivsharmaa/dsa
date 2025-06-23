package demo;

import java.util.Scanner;

public class Pattern19{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), row=1, nst1=n/2+1, nst2=n/2+1, nsp=-1;
		
		while(row<=n) {
			int cst1=1;
			
			while(cst1<=nst1) {
					System.out.print("* ");
			
				cst1++;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2=1;
			if(row==1 || row == n) {
				cst2++;
			}
			while(cst2<=nst2) {
				System.out.print("* ");
				cst2++;
			}
		
			System.out.println();
			if(row<=n/2) {
				nst1--;
				nst2--;
				nsp+=2;
				
			}else {
				nst1++;
				nst2++;
				nsp-=2;

			}
			row++;
		}
	}
}