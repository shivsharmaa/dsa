package demo;

import java.util.Scanner;

public class PatternMountain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt(), row=1, nst1=1, nst2=1, nsp=2*n - 3;
			
			while(row<=n) {
				int val=row;
				
				int cst1=1;
				
				while(cst1<=nst1) {
					
					System.out.print(cst1+" ");
					cst1++;
					
				}
				int csp =0;
				while(csp<nsp) {
					System.out.print("  ");
				csp++;
				}
				
				int cst2=1;
				if(row==n) {
					cst2++;
					val--;
				}
				
				while(cst2<=nst2) {
					System.out.print(val+" ");
				cst2++;
					
					val--;
				
				}
				
				
				System.out.println();
				nst1++;
				nst2++;
				nsp-=2;
				row++;
			}
			
		}
}
