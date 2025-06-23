package demo;

import java.util.Scanner;

public class PatternMagic {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt(), row=1, nst1=n, nst2=n, nsp=-1;
			
			while(row<=2*n - 1) {
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
				if(row==1 || row == 2*n-1) {
					cst2++;
				}
				while(cst2<=nst2) {
					System.out.print("* ");
					cst2++;
				}
			
				System.out.println();
				if(row<n) {
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
